// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * create domain response
 */
public class CreateDomainResponse extends TeaModel {
    /**
     * <p>Domain APICName</p>
     */
    @NameInMap("api_cname")
    public String apiCname;

    /**
     * <p>Domain AppCName</p>
     */
    @NameInMap("app_cname")
    public String appCname;

    @NameInMap("app_config")
    public AppConfig appConfig;

    @NameInMap("archive_config")
    public ArchiveConfig archiveConfig;

    /**
     * <p>打包下载配置</p>
     */
    @NameInMap("archive_files_enable")
    public Boolean archiveFilesEnable;

    @NameInMap("audit_log_config")
    public AuditLogConfig auditLogConfig;

    /**
     * <p>Domain AuthCName</p>
     */
    @NameInMap("auth_cname")
    public String authCname;

    /**
     * <p>登录相关信息</p>
     */
    @NameInMap("auth_config")
    public java.util.Map<String, ?> authConfig;

    /**
     * <p>钉钉 App Id</p>
     */
    @NameInMap("auth_dingding_app_id")
    public String authDingdingAppId;

    /**
     * <p>钉钉 App Secret</p>
     */
    @NameInMap("auth_dingding_app_secret")
    public String authDingdingAppSecret;

    /**
     * <p>是否开启了钉钉认证</p>
     */
    @NameInMap("auth_dingding_enable")
    public Boolean authDingdingEnable;

    /**
     * <p>RAM App Id</p>
     */
    @NameInMap("auth_ram_app_id")
    public String authRamAppId;

    /**
     * <p>RAM App Secret</p>
     */
    @NameInMap("auth_ram_app_secret")
    public String authRamAppSecret;

    /**
     * <p>是否开启了 RAM 认证</p>
     */
    @NameInMap("auth_ram_enable")
    public Boolean authRamEnable;

    @NameInMap("benefits")
    public java.util.Map<String, ?> benefits;

    /**
     * <p>Domain 创建时间</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>数据 Hash 算法</p>
     */
    @NameInMap("data_hash_name")
    public String dataHashName;

    @NameInMap("default_super_admin_config")
    public DomainSuperAdminConfig defaultSuperAdminConfig;

    /**
     * <p>Domain 描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Domain ID</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>Domain 描述</p>
     */
    @NameInMap("domain_name")
    public String domainName;

    @NameInMap("endpoints")
    public DomainEndpointsResponse endpoints;

    /**
     * <p>企业文件管理专属登录开关</p>
     */
    @NameInMap("enterprise_customized_login")
    public Boolean enterpriseCustomizedLogin;

    /**
     * <p>事件通知 MNS 匹配文件名</p>
     */
    @NameInMap("event_filename_matches")
    public String eventFilenameMatches;

    /**
     * <p>事件通知 MNS Endpoint</p>
     */
    @NameInMap("event_mns_endpoint")
    public String eventMnsEndpoint;

    /**
     * <p>事件通知 MNS Topic</p>
     */
    @NameInMap("event_mns_topic")
    public String eventMnsTopic;

    /**
     * <p>事件名列表</p>
     */
    @NameInMap("event_names")
    public java.util.List<String> eventNames;

    /**
     * <p>事件通知 Role Arn</p>
     */
    @NameInMap("event_role_arn")
    public String eventRoleArn;

    /**
     * <p>预付费domain过期时间</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

    @NameInMap("file_category")
    public java.util.Map<String, ?> fileCategory;

    @NameInMap("group_config")
    public GroupConfig groupConfig;

    @NameInMap("group_single_drive_enabled")
    public Boolean groupSingleDriveEnabled;

    /**
     * <p>是否开启了自动初始化 Drive</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>自动初始化 Drive 大小</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>自动初始化 Drive 所用 Store ID</p>
     */
    @NameInMap("init_drive_store_id")
    public String initDriveStoreId;

    /**
     * <p>Domain 类型</p>
     */
    @NameInMap("mode")
    public String mode;

    @NameInMap("multi_revision_config")
    public BaseMultiRevisionConfigResponse multiRevisionConfig;

    @NameInMap("office_edit_config")
    public OfficeEditConfig officeEditConfig;

    @NameInMap("office_preview_config")
    public OfficePreviewConfig officePreviewConfig;

    @NameInMap("parallel_upload_enabled")
    public Boolean parallelUploadEnabled;

    /**
     * <p>Parent Domain ID</p>
     */
    @NameInMap("parent_domain_id")
    public String parentDomainId;

    /**
     * <p>Domain 类型</p>
     */
    @NameInMap("path_type")
    public String pathType;

    /**
     * <p>预付费套餐</p>
     */
    @NameInMap("prepaid_package")
    public String prepaidPackage;

    @NameInMap("published_app_access_strategy")
    public AppAccessStrategy publishedAppAccessStrategy;

    @NameInMap("recycle_bin_config")
    public RecycleBinConfig recycleBinConfig;

    @NameInMap("role_config")
    public RoleConfig roleConfig;

    /**
     * <p>Domain ServiceCode</p>
     */
    @NameInMap("service_code")
    public String serviceCode;

    /**
     * <p>是否开启了共享</p>
     */
    @NameInMap("sharable")
    public Boolean sharable;

    @NameInMap("share_detail")
    public ShareDetailResponse shareDetail;

    @NameInMap("share_link_detail")
    public ShareLinkDetailResponse shareLinkDetail;

    /**
     * <p>是否开启了分享</p>
     */
    @NameInMap("share_link_enabled")
    public Boolean shareLinkEnabled;

    /**
     * <p>容量配额</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    @NameInMap("size_quota_used")
    public Long sizeQuotaUsed;

    /**
     * <p>SPI 实例 id</p>
     */
    @NameInMap("spi_instance_id")
    public String spiInstanceId;

    /**
     * <p>domain状态：创建中，正常，已过期</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>存储级别</p>
     */
    @NameInMap("store_level")
    public String storeLevel;

    /**
     * <p>存储 Region 列表</p>
     */
    @NameInMap("store_region_list")
    public java.util.List<String> storeRegionList;

    @NameInMap("subdomain_config")
    public SubdomainConfig subdomainConfig;

    /**
     * <p>Domain 更新时间</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>逻辑空间使用量，单位为字节</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    /**
     * <p>逻辑空间刷新周期，单位：秒</p>
     */
    @NameInMap("used_size_refresh_interval")
    public Long usedSizeRefreshInterval;

    /**
     * <p>用户数配额</p>
     */
    @NameInMap("user_count_quota")
    public Long userCountQuota;

    /**
     * <p>user和group只能有一个drive的开关</p>
     */
    @NameInMap("user_single_drive_enabled")
    public Boolean userSingleDriveEnabled;

    @NameInMap("video_preview_app_config")
    public VideoPreviewAppConfig videoPreviewAppConfig;

    @NameInMap("video_preview_config")
    public VideoPreviewConfig videoPreviewConfig;

    @NameInMap("watermark_config")
    public BaseWatermarkConfigResponse watermarkConfig;

    public static CreateDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponse self = new CreateDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponse setApiCname(String apiCname) {
        this.apiCname = apiCname;
        return this;
    }
    public String getApiCname() {
        return this.apiCname;
    }

    public CreateDomainResponse setAppCname(String appCname) {
        this.appCname = appCname;
        return this;
    }
    public String getAppCname() {
        return this.appCname;
    }

    public CreateDomainResponse setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public AppConfig getAppConfig() {
        return this.appConfig;
    }

    public CreateDomainResponse setArchiveConfig(ArchiveConfig archiveConfig) {
        this.archiveConfig = archiveConfig;
        return this;
    }
    public ArchiveConfig getArchiveConfig() {
        return this.archiveConfig;
    }

    public CreateDomainResponse setArchiveFilesEnable(Boolean archiveFilesEnable) {
        this.archiveFilesEnable = archiveFilesEnable;
        return this;
    }
    public Boolean getArchiveFilesEnable() {
        return this.archiveFilesEnable;
    }

    public CreateDomainResponse setAuditLogConfig(AuditLogConfig auditLogConfig) {
        this.auditLogConfig = auditLogConfig;
        return this;
    }
    public AuditLogConfig getAuditLogConfig() {
        return this.auditLogConfig;
    }

    public CreateDomainResponse setAuthCname(String authCname) {
        this.authCname = authCname;
        return this;
    }
    public String getAuthCname() {
        return this.authCname;
    }

    public CreateDomainResponse setAuthConfig(java.util.Map<String, ?> authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public java.util.Map<String, ?> getAuthConfig() {
        return this.authConfig;
    }

    public CreateDomainResponse setAuthDingdingAppId(String authDingdingAppId) {
        this.authDingdingAppId = authDingdingAppId;
        return this;
    }
    public String getAuthDingdingAppId() {
        return this.authDingdingAppId;
    }

    public CreateDomainResponse setAuthDingdingAppSecret(String authDingdingAppSecret) {
        this.authDingdingAppSecret = authDingdingAppSecret;
        return this;
    }
    public String getAuthDingdingAppSecret() {
        return this.authDingdingAppSecret;
    }

    public CreateDomainResponse setAuthDingdingEnable(Boolean authDingdingEnable) {
        this.authDingdingEnable = authDingdingEnable;
        return this;
    }
    public Boolean getAuthDingdingEnable() {
        return this.authDingdingEnable;
    }

    public CreateDomainResponse setAuthRamAppId(String authRamAppId) {
        this.authRamAppId = authRamAppId;
        return this;
    }
    public String getAuthRamAppId() {
        return this.authRamAppId;
    }

    public CreateDomainResponse setAuthRamAppSecret(String authRamAppSecret) {
        this.authRamAppSecret = authRamAppSecret;
        return this;
    }
    public String getAuthRamAppSecret() {
        return this.authRamAppSecret;
    }

    public CreateDomainResponse setAuthRamEnable(Boolean authRamEnable) {
        this.authRamEnable = authRamEnable;
        return this;
    }
    public Boolean getAuthRamEnable() {
        return this.authRamEnable;
    }

    public CreateDomainResponse setBenefits(java.util.Map<String, ?> benefits) {
        this.benefits = benefits;
        return this;
    }
    public java.util.Map<String, ?> getBenefits() {
        return this.benefits;
    }

    public CreateDomainResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateDomainResponse setDataHashName(String dataHashName) {
        this.dataHashName = dataHashName;
        return this;
    }
    public String getDataHashName() {
        return this.dataHashName;
    }

    public CreateDomainResponse setDefaultSuperAdminConfig(DomainSuperAdminConfig defaultSuperAdminConfig) {
        this.defaultSuperAdminConfig = defaultSuperAdminConfig;
        return this;
    }
    public DomainSuperAdminConfig getDefaultSuperAdminConfig() {
        return this.defaultSuperAdminConfig;
    }

    public CreateDomainResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDomainResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateDomainResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDomainResponse setEndpoints(DomainEndpointsResponse endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public DomainEndpointsResponse getEndpoints() {
        return this.endpoints;
    }

    public CreateDomainResponse setEnterpriseCustomizedLogin(Boolean enterpriseCustomizedLogin) {
        this.enterpriseCustomizedLogin = enterpriseCustomizedLogin;
        return this;
    }
    public Boolean getEnterpriseCustomizedLogin() {
        return this.enterpriseCustomizedLogin;
    }

    public CreateDomainResponse setEventFilenameMatches(String eventFilenameMatches) {
        this.eventFilenameMatches = eventFilenameMatches;
        return this;
    }
    public String getEventFilenameMatches() {
        return this.eventFilenameMatches;
    }

    public CreateDomainResponse setEventMnsEndpoint(String eventMnsEndpoint) {
        this.eventMnsEndpoint = eventMnsEndpoint;
        return this;
    }
    public String getEventMnsEndpoint() {
        return this.eventMnsEndpoint;
    }

    public CreateDomainResponse setEventMnsTopic(String eventMnsTopic) {
        this.eventMnsTopic = eventMnsTopic;
        return this;
    }
    public String getEventMnsTopic() {
        return this.eventMnsTopic;
    }

    public CreateDomainResponse setEventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }
    public java.util.List<String> getEventNames() {
        return this.eventNames;
    }

    public CreateDomainResponse setEventRoleArn(String eventRoleArn) {
        this.eventRoleArn = eventRoleArn;
        return this;
    }
    public String getEventRoleArn() {
        return this.eventRoleArn;
    }

    public CreateDomainResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateDomainResponse setFileCategory(java.util.Map<String, ?> fileCategory) {
        this.fileCategory = fileCategory;
        return this;
    }
    public java.util.Map<String, ?> getFileCategory() {
        return this.fileCategory;
    }

    public CreateDomainResponse setGroupConfig(GroupConfig groupConfig) {
        this.groupConfig = groupConfig;
        return this;
    }
    public GroupConfig getGroupConfig() {
        return this.groupConfig;
    }

    public CreateDomainResponse setGroupSingleDriveEnabled(Boolean groupSingleDriveEnabled) {
        this.groupSingleDriveEnabled = groupSingleDriveEnabled;
        return this;
    }
    public Boolean getGroupSingleDriveEnabled() {
        return this.groupSingleDriveEnabled;
    }

    public CreateDomainResponse setInitDriveEnable(Boolean initDriveEnable) {
        this.initDriveEnable = initDriveEnable;
        return this;
    }
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    public CreateDomainResponse setInitDriveSize(Long initDriveSize) {
        this.initDriveSize = initDriveSize;
        return this;
    }
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    public CreateDomainResponse setInitDriveStoreId(String initDriveStoreId) {
        this.initDriveStoreId = initDriveStoreId;
        return this;
    }
    public String getInitDriveStoreId() {
        return this.initDriveStoreId;
    }

    public CreateDomainResponse setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateDomainResponse setMultiRevisionConfig(BaseMultiRevisionConfigResponse multiRevisionConfig) {
        this.multiRevisionConfig = multiRevisionConfig;
        return this;
    }
    public BaseMultiRevisionConfigResponse getMultiRevisionConfig() {
        return this.multiRevisionConfig;
    }

    public CreateDomainResponse setOfficeEditConfig(OfficeEditConfig officeEditConfig) {
        this.officeEditConfig = officeEditConfig;
        return this;
    }
    public OfficeEditConfig getOfficeEditConfig() {
        return this.officeEditConfig;
    }

    public CreateDomainResponse setOfficePreviewConfig(OfficePreviewConfig officePreviewConfig) {
        this.officePreviewConfig = officePreviewConfig;
        return this;
    }
    public OfficePreviewConfig getOfficePreviewConfig() {
        return this.officePreviewConfig;
    }

    public CreateDomainResponse setParallelUploadEnabled(Boolean parallelUploadEnabled) {
        this.parallelUploadEnabled = parallelUploadEnabled;
        return this;
    }
    public Boolean getParallelUploadEnabled() {
        return this.parallelUploadEnabled;
    }

    public CreateDomainResponse setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
        return this;
    }
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    public CreateDomainResponse setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public CreateDomainResponse setPrepaidPackage(String prepaidPackage) {
        this.prepaidPackage = prepaidPackage;
        return this;
    }
    public String getPrepaidPackage() {
        return this.prepaidPackage;
    }

    public CreateDomainResponse setPublishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
        this.publishedAppAccessStrategy = publishedAppAccessStrategy;
        return this;
    }
    public AppAccessStrategy getPublishedAppAccessStrategy() {
        return this.publishedAppAccessStrategy;
    }

    public CreateDomainResponse setRecycleBinConfig(RecycleBinConfig recycleBinConfig) {
        this.recycleBinConfig = recycleBinConfig;
        return this;
    }
    public RecycleBinConfig getRecycleBinConfig() {
        return this.recycleBinConfig;
    }

    public CreateDomainResponse setRoleConfig(RoleConfig roleConfig) {
        this.roleConfig = roleConfig;
        return this;
    }
    public RoleConfig getRoleConfig() {
        return this.roleConfig;
    }

    public CreateDomainResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateDomainResponse setSharable(Boolean sharable) {
        this.sharable = sharable;
        return this;
    }
    public Boolean getSharable() {
        return this.sharable;
    }

    public CreateDomainResponse setShareDetail(ShareDetailResponse shareDetail) {
        this.shareDetail = shareDetail;
        return this;
    }
    public ShareDetailResponse getShareDetail() {
        return this.shareDetail;
    }

    public CreateDomainResponse setShareLinkDetail(ShareLinkDetailResponse shareLinkDetail) {
        this.shareLinkDetail = shareLinkDetail;
        return this;
    }
    public ShareLinkDetailResponse getShareLinkDetail() {
        return this.shareLinkDetail;
    }

    public CreateDomainResponse setShareLinkEnabled(Boolean shareLinkEnabled) {
        this.shareLinkEnabled = shareLinkEnabled;
        return this;
    }
    public Boolean getShareLinkEnabled() {
        return this.shareLinkEnabled;
    }

    public CreateDomainResponse setSizeQuota(Long sizeQuota) {
        this.sizeQuota = sizeQuota;
        return this;
    }
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    public CreateDomainResponse setSizeQuotaUsed(Long sizeQuotaUsed) {
        this.sizeQuotaUsed = sizeQuotaUsed;
        return this;
    }
    public Long getSizeQuotaUsed() {
        return this.sizeQuotaUsed;
    }

    public CreateDomainResponse setSpiInstanceId(String spiInstanceId) {
        this.spiInstanceId = spiInstanceId;
        return this;
    }
    public String getSpiInstanceId() {
        return this.spiInstanceId;
    }

    public CreateDomainResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CreateDomainResponse setStoreLevel(String storeLevel) {
        this.storeLevel = storeLevel;
        return this;
    }
    public String getStoreLevel() {
        return this.storeLevel;
    }

    public CreateDomainResponse setStoreRegionList(java.util.List<String> storeRegionList) {
        this.storeRegionList = storeRegionList;
        return this;
    }
    public java.util.List<String> getStoreRegionList() {
        return this.storeRegionList;
    }

    public CreateDomainResponse setSubdomainConfig(SubdomainConfig subdomainConfig) {
        this.subdomainConfig = subdomainConfig;
        return this;
    }
    public SubdomainConfig getSubdomainConfig() {
        return this.subdomainConfig;
    }

    public CreateDomainResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateDomainResponse setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

    public CreateDomainResponse setUsedSizeRefreshInterval(Long usedSizeRefreshInterval) {
        this.usedSizeRefreshInterval = usedSizeRefreshInterval;
        return this;
    }
    public Long getUsedSizeRefreshInterval() {
        return this.usedSizeRefreshInterval;
    }

    public CreateDomainResponse setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

    public CreateDomainResponse setUserSingleDriveEnabled(Boolean userSingleDriveEnabled) {
        this.userSingleDriveEnabled = userSingleDriveEnabled;
        return this;
    }
    public Boolean getUserSingleDriveEnabled() {
        return this.userSingleDriveEnabled;
    }

    public CreateDomainResponse setVideoPreviewAppConfig(VideoPreviewAppConfig videoPreviewAppConfig) {
        this.videoPreviewAppConfig = videoPreviewAppConfig;
        return this;
    }
    public VideoPreviewAppConfig getVideoPreviewAppConfig() {
        return this.videoPreviewAppConfig;
    }

    public CreateDomainResponse setVideoPreviewConfig(VideoPreviewConfig videoPreviewConfig) {
        this.videoPreviewConfig = videoPreviewConfig;
        return this;
    }
    public VideoPreviewConfig getVideoPreviewConfig() {
        return this.videoPreviewConfig;
    }

    public CreateDomainResponse setWatermarkConfig(BaseWatermarkConfigResponse watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public BaseWatermarkConfigResponse getWatermarkConfig() {
        return this.watermarkConfig;
    }

}
