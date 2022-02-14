package com.ucucs.rental.advice;

import com.ucucs.rental.model.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

    /**
     * 处理缺少请求头异常
     *
     * @param e 异常
     * @return 响应
     */
    @ExceptionHandler(value = MissingRequestHeaderException.class)
    public CommonResponse<String> missingRequestHeaderExceptionHandler(MissingRequestHeaderException e) {
        return CommonResponse.createForError("请求参数缺失");
    }

    /**
     * 处理缺少请求参数异常
     *
     * @param e 异常
     * @return 响应
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public CommonResponse<String> missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException e) {
        return CommonResponse.createForError("请求参数缺失");
    }

    /**
     * 字段绑定异常
     *
     * @param e 异常
     * @return 响应
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public CommonResponse<String> bindExceptionHandler(BindException e) {
        String msg = e.getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .filter(Objects::nonNull)
                .findFirst().orElse("绑定错误");

        String fieldName = Optional.ofNullable(e.getFieldError())
                .map(FieldError::getField)
                .orElse("参数");
        return CommonResponse.createForError(String.format("%s:%s", fieldName, msg));
    }

    /**
     * 处理验证异常
     *
     * @param e 异常
     * @return 响应
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResponse<String> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();

        String message = allErrors.stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining(";"));
        return CommonResponse.createForError(message);
    }

    /**
     * 处理未知异常
     *
     * @param e 异常
     * @return 响应
     */
    @ExceptionHandler(Throwable.class)
    public CommonResponse<String> globalExceptionHandler(Throwable e) {
        logger.error("Throwable Exception:", e);
        return CommonResponse.createForError("系统错误");
    }

}
