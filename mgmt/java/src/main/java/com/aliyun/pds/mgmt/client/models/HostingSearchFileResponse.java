// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * search file response
 */
public class HostingSearchFileResponse extends TeaModel {
    /**
     * <p>items</p>
     */
    @NameInMap("items")
    public java.util.List<BaseHostingFileResponse> items;

    /**
     * <p>next_marker</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static HostingSearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        HostingSearchFileResponse self = new HostingSearchFileResponse();
        return TeaModel.build(map, self);
    }

    public HostingSearchFileResponse setItems(java.util.List<BaseHostingFileResponse> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BaseHostingFileResponse> getItems() {
        return this.items;
    }

    public HostingSearchFileResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
