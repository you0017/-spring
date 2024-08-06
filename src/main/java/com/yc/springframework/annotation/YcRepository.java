package com.yc.springframework.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@YcComponent
public @interface YcRepository {
    String value() default "";
}
