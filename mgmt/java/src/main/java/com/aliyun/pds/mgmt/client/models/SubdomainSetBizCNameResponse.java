// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class SubdomainSetBizCNameResponse extends TeaModel {
    /**
     * <p>biz cname</p>
     */
    @NameInMap("biz_cname")
    public String bizCname;

    @NameInMap("cname_status")
    public CNameStatus cnameStatus;

    /**
     * <p>cname type</p>
     */
    @NameInMap("cname_type")
    public String cnameType;

    /**
     * <p>domain ID</p>
     */
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    /**
     * <p>is vpc</p>
     */
    @NameInMap("is_vpc")
    public Boolean isVpc;

    /**
     * <p>subdomain ID</p>
     */
    @NameInMap("subdomain_id")
    @Validation(required = true)
    public String subdomainId;

    public static SubdomainSetBizCNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SubdomainSetBizCNameResponse self = new SubdomainSetBizCNameResponse();
        return TeaModel.build(map, self);
    }

    public SubdomainSetBizCNameResponse setBizCname(String bizCname) {
        this.bizCname = bizCname;
        return this;
    }
    public String getBizCname() {
        return this.bizCname;
    }

    public SubdomainSetBizCNameResponse setCnameStatus(CNameStatus cnameStatus) {
        this.cnameStatus = cnameStatus;
        return this;
    }
    public CNameStatus getCnameStatus() {
        return this.cnameStatus;
    }

    public SubdomainSetBizCNameResponse setCnameType(String cnameType) {
        this.cnameType = cnameType;
        return this;
    }
    public String getCnameType() {
        return this.cnameType;
    }

    public SubdomainSetBizCNameResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public SubdomainSetBizCNameResponse setIsVpc(Boolean isVpc) {
        this.isVpc = isVpc;
        return this;
    }
    public Boolean getIsVpc() {
        return this.isVpc;
    }

    public SubdomainSetBizCNameResponse setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

}
