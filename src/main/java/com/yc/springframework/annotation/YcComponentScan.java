package com.yc.springframework.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface YcComponentScan {
    String[] basePackages() default {};
    String[] value() default {};
}
