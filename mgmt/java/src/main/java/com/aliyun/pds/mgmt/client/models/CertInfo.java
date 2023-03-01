// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class CertInfo extends TeaModel {
    @NameInMap("CertID")
    public String CertID;

    /**
     * <p>cert body</p>
     */
    @NameInMap("cert_body")
    @Validation(required = true)
    public String certBody;

    /**
     * <p>cert name</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    /**
     * <p>cert privatekey</p>
     */
    @NameInMap("cert_privatekey")
    @Validation(required = true)
    public String certPrivatekey;

    public static CertInfo build(java.util.Map<String, ?> map) throws Exception {
        CertInfo self = new CertInfo();
        return TeaModel.build(map, self);
    }

    public CertInfo setCertID(String CertID) {
        this.CertID = CertID;
        return this;
    }
    public String getCertID() {
        return this.CertID;
    }

    public CertInfo setCertBody(String certBody) {
        this.certBody = certBody;
        return this;
    }
    public String getCertBody() {
        return this.certBody;
    }

    public CertInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CertInfo setCertPrivatekey(String certPrivatekey) {
        this.certPrivatekey = certPrivatekey;
        return this;
    }
    public String getCertPrivatekey() {
        return this.certPrivatekey;
    }

}
