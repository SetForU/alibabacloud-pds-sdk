<?php

// This file is auto-generated, don't edit it. Thanks.

namespace Aliyun\PDS\SDK\Models;

use AlibabaCloud\Tea\Model;

class GetByLinkInfoRequest extends Model
{
    public $headers;

    /**
     * @description 额外的信息，比如type为mobile时，此字段为国家编号，不填默认86
     *
     * @example 1
     *
     * @var string
     */
    public $extra;

    /**
     * @description 唯一身份标识
     *
     * @example 15208333333
     *
     * @var string
     */
    public $identity;

    /**
     * @description 认证类型
     *
     * @example mobile
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'extra'    => 'extra',
        'identity' => 'identity',
        'type'     => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->extra) {
            $res['extra'] = $this->extra;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetByLinkInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['headers'])) {
            $model->headers = $map['headers'];
        }
        if (isset($map['extra'])) {
            $model->extra = $map['extra'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
