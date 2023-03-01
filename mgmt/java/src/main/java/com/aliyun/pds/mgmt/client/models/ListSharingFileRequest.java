// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 列举当前用户共享的文件列表
 */
public class ListSharingFileRequest extends TeaModel {
    /**
     * <p>查询返回的记录数</p>
     */
    @NameInMap("limit")
    @Validation(required = true)
    public Integer limit;

    /**
     * <p>上次查询返回的游标</p>
     */
    @NameInMap("marker")
    public String marker;

    @NameInMap("subdomain_id")
    public String subdomainId;

    public static ListSharingFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharingFileRequest self = new ListSharingFileRequest();
        return TeaModel.build(map, self);
    }

    public ListSharingFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListSharingFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListSharingFileRequest setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

}
