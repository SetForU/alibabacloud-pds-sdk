// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * get share request
 */
public class GetShareRequest extends TeaModel {
    /**
     * <p>share_id</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static GetShareRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareRequest self = new GetShareRequest();
        return TeaModel.build(map, self);
    }

    public GetShareRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
