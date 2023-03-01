// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * list_file_by_anonymous base response
 */
public class BaseFileAnonymousResponse extends TeaModel {
    /**
     * <p>file_id</p>
     */
    @NameInMap("file_id")
    @Validation(pattern = "[a-z0-9]{1,50}", maxLength = 50, minLength = 40)
    public String fileId;

    /**
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(pattern = "[a-zA-Z0-9.-]{1,1000}")
    public String name;

    /**
     * <p>size, type=file时才有效</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>thumbnail</p>
     */
    @NameInMap("thumbnail")
    public String thumbnail;

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

    public static BaseFileAnonymousResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseFileAnonymousResponse self = new BaseFileAnonymousResponse();
        return TeaModel.build(map, self);
    }

    public BaseFileAnonymousResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public BaseFileAnonymousResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BaseFileAnonymousResponse setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public BaseFileAnonymousResponse setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public BaseFileAnonymousResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BaseFileAnonymousResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
