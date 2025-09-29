package com.sachin.Annotations.CustomAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
public @interface SKAnnotation
{
    int intKey() default 0;
    String stringKey() default "defaulString";
    Class <?> classTypeKey() default String.class;
    String[] stringArrayKey() default {"default1", "default2"};
}