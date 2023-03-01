// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class AddStoreRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    /**
     * <p>存储公共前缀</p>
     */
    @NameInMap("base_path")
    public String basePath;

    /**
     * <p>bucket名称</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>domain ID</p>
     */
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    /**
     * <p>存储访问地址</p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    /**
     * <p>存储归属，system表示系统提供，custom表示使用自己的存储</p>
     */
    @NameInMap("ownership")
    public String ownership;

    /**
     * <p>访问Bucket的角色ARN</p>
     */
    @NameInMap("role_arn")
    public String roleArn;

    /**
     * <p>存储类型，当前只支持oss</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static AddStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStoreRequest self = new AddStoreRequest();
        return TeaModel.build(map, self);
    }

    public AddStoreRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public AddStoreRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public AddStoreRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AddStoreRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AddStoreRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AddStoreRequest setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public AddStoreRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AddStoreRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
