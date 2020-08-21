// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.standard.client.models;

import com.aliyun.tea.*;

/**
 * scan file meta response
 */
public class ScanFileMetaResponse extends TeaModel {
    // items
    @NameInMap("items")
    public java.util.List<BaseFileResponse> items;

    // next_marker
    @NameInMap("next_marker")
    public String nextMarker;

    public static ScanFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanFileMetaResponse self = new ScanFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public ScanFileMetaResponse setItems(java.util.List<BaseFileResponse> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BaseFileResponse> getItems() {
        return this.items;
    }

    public ScanFileMetaResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
