// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * Get drive request
 */
public class GetDriveRequest extends TeaModel {
    /**
     * <p>Drive ID</p>
     */
    @NameInMap("drive_id")
    @Validation(required = true)
    public String driveId;

    /**
     * <p>Subdomain ID</p>
     */
    @NameInMap("subdomain_id")
    public String subdomainId;

    public static GetDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDriveRequest self = new GetDriveRequest();
        return TeaModel.build(map, self);
    }

    public GetDriveRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetDriveRequest setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

}
