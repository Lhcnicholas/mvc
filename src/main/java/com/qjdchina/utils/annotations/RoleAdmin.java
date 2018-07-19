package com.qjdchina.utils.annotations;

/**
 * Des:
 * Author:LiNic
 * Date:2018/7/20
 */
public @interface RoleAdmin {

    String value() default "";

    String description() default "管理员自定义注解";
}
