// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class AddStoreResponse extends TeaModel {
    /**
     * <p>全球加速地址</p>
     */
    @NameInMap("accelerate_endpoint")
    public String accelerateEndpoint;

    /**
     * <p>存储公共前缀</p>
     */
    @NameInMap("base_path")
    public String basePath;

    /**
     * <p>bucket名称</p>
     */
    @NameInMap("bucket")
    @Validation(required = true)
    public String bucket;

    /**
     * <p>内容分发地址</p>
     */
    @NameInMap("cdn_endpoint")
    public String cdnEndpoint;

    /**
     * <p>命中限速用户时是否关闭CDN地址返回</p>
     */
    @NameInMap("cdn_ratelimit_disable")
    public Boolean cdnRatelimitDisable;

    /**
     * <p>CDN时间控制</p>
     */
    @NameInMap("cdn_timelimit")
    public String cdnTimelimit;

    /**
     * <p>CDN鉴权key</p>
     */
    @NameInMap("cdn_url_auth_key")
    public String cdnUrlAuthKey;

    /**
     * <p>自定义全球加速地址</p>
     */
    @NameInMap("customized_accelerate_endpoint")
    public String customizedAccelerateEndpoint;

    /**
     * <p>自定义内容分发地址</p>
     */
    @NameInMap("customized_cdn_endpoint")
    public String customizedCdnEndpoint;

    /**
     * <p>自定义Public访问地址</p>
     */
    @NameInMap("customized_endpoint")
    public String customizedEndpoint;

    /**
     * <p>自定义vpc访问地址</p>
     */
    @NameInMap("customized_internal_endpoint")
    public String customizedInternalEndpoint;

    /**
     * <p>domain ID</p>
     */
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    /**
     * <p>Public访问地址</p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    /**
     * <p>冷流地址</p>
     */
    @NameInMap("enet_endpoint")
    public String enetEndpoint;

    @NameInMap("enet_percent_config")
    public WhitePercentConfig enetPercentConfig;

    /**
     * <p>vpc访问地址</p>
     */
    @NameInMap("internal_endpoint")
    public String internalEndpoint;

    /**
     * <p>地点</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>存储归属，system表示系统提供，custom表示使用自己的存储</p>
     */
    @NameInMap("ownership")
    @Validation(required = true)
    public String ownership;

    /**
     * <p>Policy授权,system类型store会将bucket权限授予当前云账号</p>
     */
    @NameInMap("policy")
    @Validation(required = true)
    public String policy;

    /**
     * <p>访问Bucket的角色ARN</p>
     */
    @NameInMap("role_arn")
    public String roleArn;

    /**
     * <p>store ID</p>
     */
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    /**
     * <p>存储类型，当前只支持oss</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static AddStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStoreResponse self = new AddStoreResponse();
        return TeaModel.build(map, self);
    }

    public AddStoreResponse setAccelerateEndpoint(String accelerateEndpoint) {
        this.accelerateEndpoint = accelerateEndpoint;
        return this;
    }
    public String getAccelerateEndpoint() {
        return this.accelerateEndpoint;
    }

    public AddStoreResponse setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public AddStoreResponse setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AddStoreResponse setCdnEndpoint(String cdnEndpoint) {
        this.cdnEndpoint = cdnEndpoint;
        return this;
    }
    public String getCdnEndpoint() {
        return this.cdnEndpoint;
    }

    public AddStoreResponse setCdnRatelimitDisable(Boolean cdnRatelimitDisable) {
        this.cdnRatelimitDisable = cdnRatelimitDisable;
        return this;
    }
    public Boolean getCdnRatelimitDisable() {
        return this.cdnRatelimitDisable;
    }

    public AddStoreResponse setCdnTimelimit(String cdnTimelimit) {
        this.cdnTimelimit = cdnTimelimit;
        return this;
    }
    public String getCdnTimelimit() {
        return this.cdnTimelimit;
    }

    public AddStoreResponse setCdnUrlAuthKey(String cdnUrlAuthKey) {
        this.cdnUrlAuthKey = cdnUrlAuthKey;
        return this;
    }
    public String getCdnUrlAuthKey() {
        return this.cdnUrlAuthKey;
    }

    public AddStoreResponse setCustomizedAccelerateEndpoint(String customizedAccelerateEndpoint) {
        this.customizedAccelerateEndpoint = customizedAccelerateEndpoint;
        return this;
    }
    public String getCustomizedAccelerateEndpoint() {
        return this.customizedAccelerateEndpoint;
    }

    public AddStoreResponse setCustomizedCdnEndpoint(String customizedCdnEndpoint) {
        this.customizedCdnEndpoint = customizedCdnEndpoint;
        return this;
    }
    public String getCustomizedCdnEndpoint() {
        return this.customizedCdnEndpoint;
    }

    public AddStoreResponse setCustomizedEndpoint(String customizedEndpoint) {
        this.customizedEndpoint = customizedEndpoint;
        return this;
    }
    public String getCustomizedEndpoint() {
        return this.customizedEndpoint;
    }

    public AddStoreResponse setCustomizedInternalEndpoint(String customizedInternalEndpoint) {
        this.customizedInternalEndpoint = customizedInternalEndpoint;
        return this;
    }
    public String getCustomizedInternalEndpoint() {
        return this.customizedInternalEndpoint;
    }

    public AddStoreResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AddStoreResponse setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AddStoreResponse setEnetEndpoint(String enetEndpoint) {
        this.enetEndpoint = enetEndpoint;
        return this;
    }
    public String getEnetEndpoint() {
        return this.enetEndpoint;
    }

    public AddStoreResponse setEnetPercentConfig(WhitePercentConfig enetPercentConfig) {
        this.enetPercentConfig = enetPercentConfig;
        return this;
    }
    public WhitePercentConfig getEnetPercentConfig() {
        return this.enetPercentConfig;
    }

    public AddStoreResponse setInternalEndpoint(String internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
        return this;
    }
    public String getInternalEndpoint() {
        return this.internalEndpoint;
    }

    public AddStoreResponse setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public AddStoreResponse setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public AddStoreResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AddStoreResponse setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AddStoreResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public AddStoreResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
