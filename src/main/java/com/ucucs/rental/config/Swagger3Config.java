package com.ucucs.rental.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.service.Response;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@EnableKnife4j
@Configuration
@EnableOpenApi
public class Swagger3Config {

    /**
     * swagger3的配置文件
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any()).build().globalRequestParameters(getGlobalRequestParameters()).globalResponses(HttpMethod.GET, getGlobalResponseMessage()).globalResponses(HttpMethod.POST, getGlobalResponseMessage()).globalResponses(HttpMethod.DELETE, getGlobalResponseMessage()).globalResponses(HttpMethod.PUT, getGlobalResponseMessage());
    }

    /**
     * 构建 api文档的详细信息函数
     */
    private ApiInfo apiInfo() {
        // 获取工程名称
        String projectName = "Car Rental";
        return new ApiInfoBuilder().title(projectName + " API Document").contact(new Contact("ucucs", "", "ucucs@icloud.com")).version("1.0").description("API Document For Car Rental").build();
    }

    /**
     * 生成全局通用参数
     *
     * @return 参数
     */
    private List<RequestParameter> getGlobalRequestParameters() {
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder().name("x-access-token").description("令牌").required(false).in(ParameterType.HEADER).build());
        return parameters;
    }

    /**
     * 生成通用响应信息
     *
     * @return 响应
     */
    private List<Response> getGlobalResponseMessage() {
        List<Response> responseList = new ArrayList<>();
        responseList.add(new ResponseBuilder().code("404").description("找不到资源").build());
        return responseList;
    }
}
