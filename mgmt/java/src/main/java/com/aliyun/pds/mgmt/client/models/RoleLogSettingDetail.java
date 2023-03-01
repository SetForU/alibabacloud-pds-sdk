// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class RoleLogSettingDetail extends TeaModel {
    /**
     * <p>role_tag_description</p>
     */
    @NameInMap("role_tag_description")
    public String roleTagDescription;

    /**
     * <p>role_tag_name</p>
     */
    @NameInMap("role_tag_name")
    public String roleTagName;

    public static RoleLogSettingDetail build(java.util.Map<String, ?> map) throws Exception {
        RoleLogSettingDetail self = new RoleLogSettingDetail();
        return TeaModel.build(map, self);
    }

    public RoleLogSettingDetail setRoleTagDescription(String roleTagDescription) {
        this.roleTagDescription = roleTagDescription;
        return this;
    }
    public String getRoleTagDescription() {
        return this.roleTagDescription;
    }

    public RoleLogSettingDetail setRoleTagName(String roleTagName) {
        this.roleTagName = roleTagName;
        return this;
    }
    public String getRoleTagName() {
        return this.roleTagName;
    }

}
