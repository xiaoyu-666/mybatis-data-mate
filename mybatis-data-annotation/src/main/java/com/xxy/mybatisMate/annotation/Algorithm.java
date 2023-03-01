package com.xxy.mybatisMate.annotation;

public enum Algorithm {
    MD5_32,
    MD5_16,
    AES,
    SM2,
    SM3,
    SM4,
    RSA,
    BASE64,
    PBEWithMD5AndDES,
    PBEWithMD5AndTripleDES,
    PBEWithHMACSHA512AndAES_256,
    PBEWithSHA1AndDESede,
    PBEWithSHA1AndRC2_40;

    private Algorithm() {
    }
}
