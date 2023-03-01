// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 获取文件夹信息
 */
public class CCPGetFolderInfoResponse extends TeaModel {
    /**
     * <p>total_size</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    /**
     * <p>used_size</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    public static CCPGetFolderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CCPGetFolderInfoResponse self = new CCPGetFolderInfoResponse();
        return TeaModel.build(map, self);
    }

    public CCPGetFolderInfoResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public CCPGetFolderInfoResponse setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
