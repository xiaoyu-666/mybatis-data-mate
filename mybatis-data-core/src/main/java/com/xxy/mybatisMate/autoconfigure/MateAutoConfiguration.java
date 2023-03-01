package com.xxy.mybatisMate.autoconfigure;

import com.xxy.mybatisMate.config.CertProperties;
import com.xxy.mybatisMate.config.EncryptorProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration(
        proxyBeanMethods = false
)
@EnableConfigurationProperties({CertProperties.class, EncryptorProperties.class})
public class MateAutoConfiguration {
    private static final Logger log = LoggerFactory.getLogger(MateAutoConfiguration.class);
    @Autowired
    private EncryptorProperties encryptorProperties;
    @Autowired
    private CertProperties certProperties;



}
