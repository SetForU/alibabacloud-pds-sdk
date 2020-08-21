// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * Create file response
 */
public class OSSCreateFileResponse extends TeaModel {
    // domain_id
    @NameInMap("domain_id")
    @Validation(pattern = "[a-z0-9]{1,50}", maxLength = 50, minLength = 40)
    public String domainId;

    // drive_id
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    // file_path
    @NameInMap("file_path")
    public String filePath;

    // part_info_list
    @NameInMap("part_info_list")
    public java.util.List<UploadPartInfo> partInfoList;

    // share_id
    @NameInMap("share_id")
    @Validation(pattern = "[0-9]+")
    public String shareId;

    // type
    @NameInMap("type")
    public String type;

    // upload_id
    @NameInMap("upload_id")
    public String uploadId;

    public static OSSCreateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        OSSCreateFileResponse self = new OSSCreateFileResponse();
        return TeaModel.build(map, self);
    }

    public OSSCreateFileResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public OSSCreateFileResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public OSSCreateFileResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public OSSCreateFileResponse setPartInfoList(java.util.List<UploadPartInfo> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<UploadPartInfo> getPartInfoList() {
        return this.partInfoList;
    }

    public OSSCreateFileResponse setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public OSSCreateFileResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OSSCreateFileResponse setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
