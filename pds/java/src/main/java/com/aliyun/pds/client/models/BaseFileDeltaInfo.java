// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * the delta file info
 */
public class BaseFileDeltaInfo extends TeaModel {
    /**
     * <p>action_list</p>
     */
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    /**
     * <p>auto_delete_left_sec</p>
     */
    @NameInMap("auto_delete_left_sec")
    public Long autoDeleteLeftSec;

    /**
     * <p>category</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>CharacteristicHash</p>
     */
    @NameInMap("characteristic_hash")
    public String characteristicHash;

    /**
     * <p>Content Hash</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>content_hash_name</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>content_type</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <p>crc64_hash</p>
     */
    @NameInMap("crc64_hash")
    public String crc64Hash;

    /**
     * <p>created_at</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>creator_id</p>
     */
    @NameInMap("creator_id")
    public String creatorId;

    /**
     * <p>creator_name</p>
     */
    @NameInMap("creator_name")
    public String creatorName;

    /**
     * <p>creator_type</p>
     */
    @NameInMap("creator_type")
    public String creatorType;

    /**
     * <p>custom_field_1</p>
     */
    @NameInMap("custom_field_1")
    public String customField1;

    /**
     * <p>custom_field_2</p>
     */
    @NameInMap("custom_field_2")
    public String customField2;

    /**
     * <p>custom_type</p>
     */
    @NameInMap("custom_type")
    public String customType;

    /**
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>DomainID</p>
     */
    @NameInMap("domain_id")
    @Validation(pattern = "[a-z0-9A-Z]+")
    public String domainId;

    /**
     * <p>download_url</p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    /**
     * <p>drive_id</p>
     */
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    /**
     * <p>encrypt_mode</p>
     */
    @NameInMap("encrypt_mode")
    public String encryptMode;

    /**
     * <p>ex_fields_info</p>
     */
    @NameInMap("ex_fields_info")
    public java.util.Map<String, ?> exFieldsInfo;

    /**
     * <p>file_extension</p>
     */
    @NameInMap("file_extension")
    public String fileExtension;

    /**
     * <p>file_id</p>
     */
    @NameInMap("file_id")
    @Validation(pattern = "[a-z0-9]{1,50}", maxLength = 50, minLength = 40)
    public String fileId;

    /**
     * <p>TODO 先不在API上透出该字段，file_path_type目前在edm中返回；path type是否在PDS通用逻辑中展示，展示的含义是什么，需要再做分析</p>
     */
    @NameInMap("file_path_type")
    public String filePathType;

    /**
     * <p>Hidden</p>
     * <p>type: boolean</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("image_media_metadata")
    public ImageMediaResponse imageMediaMetadata;

    /**
     * <p>InvestigationStatus</p>
     */
    @NameInMap("investigation_status")
    public Long investigationStatus;

    /**
     * <p>labels</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    /**
     * <p>last_modifier_id</p>
     */
    @NameInMap("last_modifier_id")
    public String lastModifierId;

    /**
     * <p>last_modifier_name</p>
     */
    @NameInMap("last_modifier_name")
    public String lastModifierName;

    /**
     * <p>last_modifier_type</p>
     */
    @NameInMap("last_modifier_type")
    public String lastModifierType;

    /**
     * <p>local_created_at</p>
     */
    @NameInMap("local_created_at")
    public String localCreatedAt;

    @NameInMap("local_modified_at")
    public String localModifiedAt;

    @NameInMap("meta")
    public String meta;

    /**
     * <p>mime_extension</p>
     */
    @NameInMap("mime_extension")
    public String mimeExtension;

    /**
     * <p>mime_type</p>
     */
    @NameInMap("mime_type")
    public String mimeType;

    /**
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true, pattern = "[a-zA-Z0-9.-]{1,1000}")
    public String name;

    /**
     * <p>parent_file_id</p>
     */
    @NameInMap("parent_file_id")
    @Validation(pattern = "[a-z0-9]{1,50}", maxLength = 50, minLength = 40)
    public String parentFileId;

    /**
     * <p>PunishFlag</p>
     */
    @NameInMap("punish_flag")
    public Long punishFlag;

    /**
     * <p>PunishReason</p>
     */
    @NameInMap("punish_reason")
    public String punishReason;

    /**
     * <p>revision_id</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    /**
     * <p>revision_version</p>
     */
    @NameInMap("revision_version")
    public Long revisionVersion;

    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>Size</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>starred</p>
     * <p>type: boolean</p>
     */
    @NameInMap("starred")
    public Boolean starred;

    /**
     * <p>status</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>@Deprecated streams url info</p>
     */
    @NameInMap("streams_info")
    public java.util.Map<String, ?> streamsInfo;

    /**
     * <p>sync_device_flag</p>
     */
    @NameInMap("sync_device_flag")
    public Boolean syncDeviceFlag;

    /**
     * <p>sync_flag</p>
     */
    @NameInMap("sync_flag")
    public Boolean syncFlag;

    /**
     * <p>sync_meta</p>
     */
    @NameInMap("sync_meta")
    public String syncMeta;

    /**
     * <p>thumbnail</p>
     */
    @NameInMap("thumbnail")
    public String thumbnail;

    /**
     * <p>thumbnail_urls</p>
     */
    @NameInMap("thumbnail_urls")
    public java.util.Map<String, ?> thumbnailUrls;

    /**
     * <p>trashed_at</p>
     */
    @NameInMap("trashed_at")
    public String trashedAt;

    /**
     * <p>type</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>updated_at</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>upload_id</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    /**
     * <p>url</p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <p>user_meta</p>
     */
    @NameInMap("user_meta")
    public String userMeta;

    /**
     * <p>user_tags</p>
     */
    @NameInMap("user_tags")
    public java.util.Map<String, ?> userTags;

    @NameInMap("video_media_metadata")
    public VideoMediaResponse videoMediaMetadata;

    @NameInMap("video_preview_metadata")
    public VideoPreviewResponse videoPreviewMetadata;

    public static BaseFileDeltaInfo build(java.util.Map<String, ?> map) throws Exception {
        BaseFileDeltaInfo self = new BaseFileDeltaInfo();
        return TeaModel.build(map, self);
    }

    public BaseFileDeltaInfo setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public BaseFileDeltaInfo setAutoDeleteLeftSec(Long autoDeleteLeftSec) {
        this.autoDeleteLeftSec = autoDeleteLeftSec;
        return this;
    }
    public Long getAutoDeleteLeftSec() {
        return this.autoDeleteLeftSec;
    }

    public BaseFileDeltaInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public BaseFileDeltaInfo setCharacteristicHash(String characteristicHash) {
        this.characteristicHash = characteristicHash;
        return this;
    }
    public String getCharacteristicHash() {
        return this.characteristicHash;
    }

    public BaseFileDeltaInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public BaseFileDeltaInfo setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public BaseFileDeltaInfo setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public BaseFileDeltaInfo setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public BaseFileDeltaInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseFileDeltaInfo setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public BaseFileDeltaInfo setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public BaseFileDeltaInfo setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public BaseFileDeltaInfo setCustomField1(String customField1) {
        this.customField1 = customField1;
        return this;
    }
    public String getCustomField1() {
        return this.customField1;
    }

    public BaseFileDeltaInfo setCustomField2(String customField2) {
        this.customField2 = customField2;
        return this;
    }
    public String getCustomField2() {
        return this.customField2;
    }

    public BaseFileDeltaInfo setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public BaseFileDeltaInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseFileDeltaInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseFileDeltaInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public BaseFileDeltaInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public BaseFileDeltaInfo setEncryptMode(String encryptMode) {
        this.encryptMode = encryptMode;
        return this;
    }
    public String getEncryptMode() {
        return this.encryptMode;
    }

    public BaseFileDeltaInfo setExFieldsInfo(java.util.Map<String, ?> exFieldsInfo) {
        this.exFieldsInfo = exFieldsInfo;
        return this;
    }
    public java.util.Map<String, ?> getExFieldsInfo() {
        return this.exFieldsInfo;
    }

    public BaseFileDeltaInfo setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public BaseFileDeltaInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public BaseFileDeltaInfo setFilePathType(String filePathType) {
        this.filePathType = filePathType;
        return this;
    }
    public String getFilePathType() {
        return this.filePathType;
    }

    public BaseFileDeltaInfo setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public BaseFileDeltaInfo setImageMediaMetadata(ImageMediaResponse imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
        return this;
    }
    public ImageMediaResponse getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    public BaseFileDeltaInfo setInvestigationStatus(Long investigationStatus) {
        this.investigationStatus = investigationStatus;
        return this;
    }
    public Long getInvestigationStatus() {
        return this.investigationStatus;
    }

    public BaseFileDeltaInfo setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public BaseFileDeltaInfo setLastModifierId(String lastModifierId) {
        this.lastModifierId = lastModifierId;
        return this;
    }
    public String getLastModifierId() {
        return this.lastModifierId;
    }

    public BaseFileDeltaInfo setLastModifierName(String lastModifierName) {
        this.lastModifierName = lastModifierName;
        return this;
    }
    public String getLastModifierName() {
        return this.lastModifierName;
    }

    public BaseFileDeltaInfo setLastModifierType(String lastModifierType) {
        this.lastModifierType = lastModifierType;
        return this;
    }
    public String getLastModifierType() {
        return this.lastModifierType;
    }

    public BaseFileDeltaInfo setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public BaseFileDeltaInfo setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public BaseFileDeltaInfo setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public BaseFileDeltaInfo setMimeExtension(String mimeExtension) {
        this.mimeExtension = mimeExtension;
        return this;
    }
    public String getMimeExtension() {
        return this.mimeExtension;
    }

    public BaseFileDeltaInfo setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
    public String getMimeType() {
        return this.mimeType;
    }

    public BaseFileDeltaInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BaseFileDeltaInfo setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public BaseFileDeltaInfo setPunishFlag(Long punishFlag) {
        this.punishFlag = punishFlag;
        return this;
    }
    public Long getPunishFlag() {
        return this.punishFlag;
    }

    public BaseFileDeltaInfo setPunishReason(String punishReason) {
        this.punishReason = punishReason;
        return this;
    }
    public String getPunishReason() {
        return this.punishReason;
    }

    public BaseFileDeltaInfo setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public BaseFileDeltaInfo setRevisionVersion(Long revisionVersion) {
        this.revisionVersion = revisionVersion;
        return this;
    }
    public Long getRevisionVersion() {
        return this.revisionVersion;
    }

    public BaseFileDeltaInfo setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public BaseFileDeltaInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public BaseFileDeltaInfo setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public BaseFileDeltaInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BaseFileDeltaInfo setStreamsInfo(java.util.Map<String, ?> streamsInfo) {
        this.streamsInfo = streamsInfo;
        return this;
    }
    public java.util.Map<String, ?> getStreamsInfo() {
        return this.streamsInfo;
    }

    public BaseFileDeltaInfo setSyncDeviceFlag(Boolean syncDeviceFlag) {
        this.syncDeviceFlag = syncDeviceFlag;
        return this;
    }
    public Boolean getSyncDeviceFlag() {
        return this.syncDeviceFlag;
    }

    public BaseFileDeltaInfo setSyncFlag(Boolean syncFlag) {
        this.syncFlag = syncFlag;
        return this;
    }
    public Boolean getSyncFlag() {
        return this.syncFlag;
    }

    public BaseFileDeltaInfo setSyncMeta(String syncMeta) {
        this.syncMeta = syncMeta;
        return this;
    }
    public String getSyncMeta() {
        return this.syncMeta;
    }

    public BaseFileDeltaInfo setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public BaseFileDeltaInfo setThumbnailUrls(java.util.Map<String, ?> thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
        return this;
    }
    public java.util.Map<String, ?> getThumbnailUrls() {
        return this.thumbnailUrls;
    }

    public BaseFileDeltaInfo setTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    public String getTrashedAt() {
        return this.trashedAt;
    }

    public BaseFileDeltaInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BaseFileDeltaInfo setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public BaseFileDeltaInfo setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public BaseFileDeltaInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public BaseFileDeltaInfo setUserMeta(String userMeta) {
        this.userMeta = userMeta;
        return this;
    }
    public String getUserMeta() {
        return this.userMeta;
    }

    public BaseFileDeltaInfo setUserTags(java.util.Map<String, ?> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.Map<String, ?> getUserTags() {
        return this.userTags;
    }

    public BaseFileDeltaInfo setVideoMediaMetadata(VideoMediaResponse videoMediaMetadata) {
        this.videoMediaMetadata = videoMediaMetadata;
        return this;
    }
    public VideoMediaResponse getVideoMediaMetadata() {
        return this.videoMediaMetadata;
    }

    public BaseFileDeltaInfo setVideoPreviewMetadata(VideoPreviewResponse videoPreviewMetadata) {
        this.videoPreviewMetadata = videoPreviewMetadata;
        return this;
    }
    public VideoPreviewResponse getVideoPreviewMetadata() {
        return this.videoPreviewMetadata;
    }

}
