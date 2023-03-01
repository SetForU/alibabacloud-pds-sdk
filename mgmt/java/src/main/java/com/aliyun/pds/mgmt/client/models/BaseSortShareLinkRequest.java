// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class BaseSortShareLinkRequest extends TeaModel {
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

    public static BaseSortShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BaseSortShareLinkRequest self = new BaseSortShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public BaseSortShareLinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public BaseSortShareLinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

}
