package com.ucucs.rental.model;

import lombok.Getter;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@Getter
public enum ResponseCode {
    SUCCESS(0, "SUCCESS"),
    ERROR(500, "ERROR"),
    NEED_LOGIN(401, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(400, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String description;

    ResponseCode(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
