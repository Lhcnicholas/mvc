package com.qjdchina.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Des:
 * Author:LiNic
 * Date:2018/7/20
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAdmin {

    String value() default "";

    String description() default "管理员自定义注解";
}
