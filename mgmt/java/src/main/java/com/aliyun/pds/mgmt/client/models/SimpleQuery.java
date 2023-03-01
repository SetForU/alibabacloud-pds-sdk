// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class SimpleQuery extends TeaModel {
    @NameInMap("field")
    public String field;

    @NameInMap("operation")
    public String operation;

    @NameInMap("sub_queries")
    public java.util.List<SimpleQuery> subQueries;

    @NameInMap("value")
    public String value;

    public static SimpleQuery build(java.util.Map<String, ?> map) throws Exception {
        SimpleQuery self = new SimpleQuery();
        return TeaModel.build(map, self);
    }

    public SimpleQuery setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public SimpleQuery setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public SimpleQuery setSubQueries(java.util.List<SimpleQuery> subQueries) {
        this.subQueries = subQueries;
        return this;
    }
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    public SimpleQuery setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
