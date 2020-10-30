<?php

// This file is auto-generated, don't edit it. Thanks.

namespace Aliyun\Hosting\SDK\Models;

use AlibabaCloud\Tea\Model;

/**
 * list store file.
 */
class ListStoreFileRequest extends Model
{
    public $headers;

    /**
     * @description limit
     *
     * @example 50
     *
     * @var int
     */
    public $limit;

    /**
     * @description marker
     *
     * @var string
     */
    public $marker;

    /**
     * @description parent_file_path
     *
     * @var string
     */
    public $parentFilePath;

    /**
     * @description store_id
     *
     * @example xxx
     *
     * @var string
     */
    public $storeId;

    /**
     * @description type
     *
     * @example file
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'limit'          => 'limit',
        'marker'         => 'marker',
        'parentFilePath' => 'parent_file_path',
        'storeId'        => 'store_id',
        'type'           => 'type',
    ];
    protected $_default = [
        'limit' => 100,
    ];

    public function validate()
    {
        Model::validateMaximum('limit', $this->limit, 1000);
        Model::validateMinimum('limit', $this->limit, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->marker) {
            $res['marker'] = $this->marker;
        }
        if (null !== $this->parentFilePath) {
            $res['parent_file_path'] = $this->parentFilePath;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListStoreFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['headers'])) {
            $model->headers = $map['headers'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['marker'])) {
            $model->marker = $map['marker'];
        }
        if (isset($map['parent_file_path'])) {
            $model->parentFilePath = $map['parent_file_path'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
