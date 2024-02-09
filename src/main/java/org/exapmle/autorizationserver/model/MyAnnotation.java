package org.exapmle.autorizationserver.model;

import org.springframework.web.bind.annotation.ValueConstants;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    String name() default "";

    String value() default ValueConstants.DEFAULT_NONE;
}

