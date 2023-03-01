package com.xxy.mybatisMate.annotation;

import com.xxy.mybatisMate.encrypt.IEncryptor;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface FieldEncrypt {
    String password() default "";

    Algorithm algorithm() default Algorithm.PBEWithMD5AndDES;

    Class<? extends IEncryptor> encryptor() default IEncryptor.class;
}
