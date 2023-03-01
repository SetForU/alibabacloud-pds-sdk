// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * Base drive response
 */
public class BaseDriveResponse extends TeaModel {
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    @NameInMap("category")
    public String category;

    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>Drive 创建者</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Drive 备注信息</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Domain ID</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>Drive ID</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Drive 名称</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>Drive 类型</p>
     */
    @NameInMap("drive_type")
    public String driveType;

    @NameInMap("encrypt_data_access")
    public Boolean encryptDataAccess;

    @NameInMap("encrypt_mode")
    public String encryptMode;

    /**
     * <p>Drive 所有者</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>Drive 所有者类型</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    @NameInMap("permission")
    public java.util.Map<String, ?> permission;

    /**
     * <p>Drive存储基于store的相对路径，domain的PathType为OSSPath时返回</p>
     */
    @NameInMap("relative_path")
    public String relativePath;

    /**
     * <p>Drive 状态</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>存储 ID, domain的PathType为OSSPath时返回</p>
     */
    @NameInMap("store_id")
    public String storeId;

    /**
     * <p>subdomain_id</p>
     */
    @NameInMap("subdomain_id")
    public String subdomainId;

    /**
     * <p>Drive 空间总量</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>Drive 空间已使用量</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    public static BaseDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseDriveResponse self = new BaseDriveResponse();
        return TeaModel.build(map, self);
    }

    public BaseDriveResponse setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public BaseDriveResponse setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public BaseDriveResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseDriveResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseDriveResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseDriveResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseDriveResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public BaseDriveResponse setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public BaseDriveResponse setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public BaseDriveResponse setEncryptDataAccess(Boolean encryptDataAccess) {
        this.encryptDataAccess = encryptDataAccess;
        return this;
    }
    public Boolean getEncryptDataAccess() {
        return this.encryptDataAccess;
    }

    public BaseDriveResponse setEncryptMode(String encryptMode) {
        this.encryptMode = encryptMode;
        return this;
    }
    public String getEncryptMode() {
        return this.encryptMode;
    }

    public BaseDriveResponse setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public BaseDriveResponse setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public BaseDriveResponse setPermission(java.util.Map<String, ?> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, ?> getPermission() {
        return this.permission;
    }

    public BaseDriveResponse setRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }
    public String getRelativePath() {
        return this.relativePath;
    }

    public BaseDriveResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BaseDriveResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public BaseDriveResponse setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

    public BaseDriveResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public BaseDriveResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public BaseDriveResponse setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
