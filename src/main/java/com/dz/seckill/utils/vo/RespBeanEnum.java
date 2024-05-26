package com.dz.seckill.utils.vo;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public enum RespBeanEnum {
    SUCCESS(200, "成功"),
    ERROR(500, "错误");

    private final Integer code;
    private final String message;
}