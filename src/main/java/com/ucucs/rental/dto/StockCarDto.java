package com.ucucs.rental.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Usage of StockCarDto
 *
 * @author wubocheng
 * @Date 2022/2/14 14:36
 */
@Data
@NoArgsConstructor
public class StockCarDto {

    private Integer carId;

    private String carName;

    private Integer stockId;

    private BigDecimal rentPrice;

    private BigDecimal deposit;

    private Integer rentalStatus;

    private Date availableFrom;

}
