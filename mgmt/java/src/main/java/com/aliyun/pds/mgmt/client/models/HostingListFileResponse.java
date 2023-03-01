// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * List file response
 */
public class HostingListFileResponse extends TeaModel {
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

    public static HostingListFileResponse build(java.util.Map<String, ?> map) throws Exception {
        HostingListFileResponse self = new HostingListFileResponse();
        return TeaModel.build(map, self);
    }

    public HostingListFileResponse setItems(java.util.List<BaseHostingFileResponse> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BaseHostingFileResponse> getItems() {
        return this.items;
    }

    public HostingListFileResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
