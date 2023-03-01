// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * update share request
 */
public class UpdateShareRequest extends TeaModel {
    /**
     * <p>description</p>
     */
    @NameInMap("description")
    @Validation(maxLength = 1024)
    public String description;

    /**
     * <p>expiration</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>permissions</p>
     */
    @NameInMap("permissions")
    public java.util.List<String> permissions;

    /**
     * <p>share_id</p>
     */
    @NameInMap("share_id")
    @Validation(required = true)
    public String shareId;

    /**
     * <p>share_name</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>share_policy</p>
     */
    @NameInMap("share_policy")
    public java.util.List<SharePermissionPolicy> sharePolicy;

    /**
     * <p>status</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateShareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareRequest self = new UpdateShareRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShareRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateShareRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateShareRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public UpdateShareRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public UpdateShareRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public UpdateShareRequest setSharePolicy(java.util.List<SharePermissionPolicy> sharePolicy) {
        this.sharePolicy = sharePolicy;
        return this;
    }
    public java.util.List<SharePermissionPolicy> getSharePolicy() {
        return this.sharePolicy;
    }

    public UpdateShareRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
