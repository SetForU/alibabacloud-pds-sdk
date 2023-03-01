// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class SetShareLinkStatusRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    /**
     * <p>domain ID</p>
     */
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    /**
     * <p>enabled</p>
     */
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    public static SetShareLinkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetShareLinkStatusRequest self = new SetShareLinkStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetShareLinkStatusRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public SetShareLinkStatusRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public SetShareLinkStatusRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
