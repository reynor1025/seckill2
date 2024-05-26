package com.dz.seckill.utils.vo;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object obj;
    public static RespBean success(){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(), RespBean.success().getMessage(),null);
    }
    public static RespBean success(Object obj){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(), RespBean.success().getMessage(),obj);
    }
    public static RespBean error(RespBeanEnum restBeanEnum){
        return new RespBean(restBeanEnum.getCode(),restBeanEnum.getMessage(),null);
    }
    public static RespBean error(RespBeanEnum restBeanEnum, Object obj){
        return new RespBean(restBeanEnum.getCode(),restBeanEnum.getMessage(),obj);
    }

}
