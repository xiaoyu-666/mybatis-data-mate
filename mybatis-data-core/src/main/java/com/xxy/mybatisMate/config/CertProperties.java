package com.xxy.mybatisMate.config;

import com.xxy.mybatisMate.license.IGrantSupplier;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@ConfigurationProperties(
        prefix = "mybatis-data-mate.cert"
)
@Data
public class CertProperties implements Serializable {

    private String grant;
    private String license;

    public String getGrant(IGrantSupplier var1){
        return null==var1?this.grant: var1.get(this.grant);
    }


}
