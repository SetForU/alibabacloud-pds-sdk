// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 打包下载
 */
public class CCPArchiveFilesRequest extends TeaModel {
    /**
     * <p>addition_data</p>
     */
    @NameInMap("addition_data")
    public java.util.Map<String, ?> additionData;

    /**
     * <p>drive_id</p>
     */
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    @NameInMap("files")
    public java.util.List<FileInfo> files;

    /**
     * <p>file_name</p>
     */
    @NameInMap("name")
    @Validation(maxLength = 1024, minLength = 1)
    public String name;

    @NameInMap("referer")
    public String referer;

    /**
     * <p>share_id, either share_id or drive_id is required</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static CCPArchiveFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        CCPArchiveFilesRequest self = new CCPArchiveFilesRequest();
        return TeaModel.build(map, self);
    }

    public CCPArchiveFilesRequest setAdditionData(java.util.Map<String, ?> additionData) {
        this.additionData = additionData;
        return this;
    }
    public java.util.Map<String, ?> getAdditionData() {
        return this.additionData;
    }

    public CCPArchiveFilesRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CCPArchiveFilesRequest setFiles(java.util.List<FileInfo> files) {
        this.files = files;
        return this;
    }
    public java.util.List<FileInfo> getFiles() {
        return this.files;
    }

    public CCPArchiveFilesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CCPArchiveFilesRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public CCPArchiveFilesRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
