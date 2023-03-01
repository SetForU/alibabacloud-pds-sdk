// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 遍历文件
 */
public class CCPWalkFileRequest extends TeaModel {
    /**
     * <p>addition_data</p>
     */
    @NameInMap("addition_data")
    public java.util.Map<String, ?> additionData;

    /**
     * <p>all</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>before_updated_at</p>
     */
    @NameInMap("before_updated_at")
    public String beforeUpdatedAt;

    /**
     * <p>category</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>drive_id</p>
     */
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    /**
     * <p>fields</p>
     */
    @NameInMap("fields")
    public String fields;

    @NameInMap("image_cropping_aspect_ratios")
    public java.util.List<String> imageCroppingAspectRatios;

    /**
     * <p>image_thumbnail_process</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>image_url_process</p>
     */
    @NameInMap("image_url_process")
    public String imageUrlProcess;

    /**
     * <p>limit</p>
     */
    @NameInMap("limit")
    @Validation(maximum = 200)
    public Long limit;

    /**
     * <p>location</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>marker</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>office_thumbnail_process</p>
     */
    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    /**
     * <p>order_by</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>order_direction</p>
     */
    @NameInMap("order_direction")
    public String orderDirection;

    /**
     * <p>ParentFileID</p>
     */
    @NameInMap("parent_file_id")
    @Validation(required = true, pattern = "[a-z0-9.-_]{1,50}", maxLength = 50, minLength = 4)
    public String parentFileId;

    @NameInMap("parent_file_id_path")
    public String parentFileIdPath;

    @NameInMap("referer")
    public String referer;

    /**
     * <p>share_id, either share_id or drive_id is required</p>
     */
    @NameInMap("share_id")
    public String shareId;

    @NameInMap("sign_token")
    public String signToken;

    /**
     * <p>starred</p>
     */
    @NameInMap("starred")
    public Boolean starred;

    /**
     * <p>status</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ?> thumbnailProcesses;

    /**
     * <p>type</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>url_expire_sec</p>
     */
    @NameInMap("url_expire_sec")
    @Validation(maximum = 14400, minimum = 10)
    public Long urlExpireSec;

    /**
     * <p>video_thumbnail_process</p>
     * <p>type:string</p>
     */
    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static CCPWalkFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CCPWalkFileRequest self = new CCPWalkFileRequest();
        return TeaModel.build(map, self);
    }

    public CCPWalkFileRequest setAdditionData(java.util.Map<String, ?> additionData) {
        this.additionData = additionData;
        return this;
    }
    public java.util.Map<String, ?> getAdditionData() {
        return this.additionData;
    }

    public CCPWalkFileRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public CCPWalkFileRequest setBeforeUpdatedAt(String beforeUpdatedAt) {
        this.beforeUpdatedAt = beforeUpdatedAt;
        return this;
    }
    public String getBeforeUpdatedAt() {
        return this.beforeUpdatedAt;
    }

    public CCPWalkFileRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CCPWalkFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CCPWalkFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public CCPWalkFileRequest setImageCroppingAspectRatios(java.util.List<String> imageCroppingAspectRatios) {
        this.imageCroppingAspectRatios = imageCroppingAspectRatios;
        return this;
    }
    public java.util.List<String> getImageCroppingAspectRatios() {
        return this.imageCroppingAspectRatios;
    }

    public CCPWalkFileRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public CCPWalkFileRequest setImageUrlProcess(String imageUrlProcess) {
        this.imageUrlProcess = imageUrlProcess;
        return this;
    }
    public String getImageUrlProcess() {
        return this.imageUrlProcess;
    }

    public CCPWalkFileRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CCPWalkFileRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CCPWalkFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public CCPWalkFileRequest setOfficeThumbnailProcess(String officeThumbnailProcess) {
        this.officeThumbnailProcess = officeThumbnailProcess;
        return this;
    }
    public String getOfficeThumbnailProcess() {
        return this.officeThumbnailProcess;
    }

    public CCPWalkFileRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public CCPWalkFileRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public CCPWalkFileRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public CCPWalkFileRequest setParentFileIdPath(String parentFileIdPath) {
        this.parentFileIdPath = parentFileIdPath;
        return this;
    }
    public String getParentFileIdPath() {
        return this.parentFileIdPath;
    }

    public CCPWalkFileRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public CCPWalkFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CCPWalkFileRequest setSignToken(String signToken) {
        this.signToken = signToken;
        return this;
    }
    public String getSignToken() {
        return this.signToken;
    }

    public CCPWalkFileRequest setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public CCPWalkFileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CCPWalkFileRequest setThumbnailProcesses(java.util.Map<String, ?> thumbnailProcesses) {
        this.thumbnailProcesses = thumbnailProcesses;
        return this;
    }
    public java.util.Map<String, ?> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    public CCPWalkFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CCPWalkFileRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public CCPWalkFileRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
