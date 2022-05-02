package com.lyh.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 3:53 下午
 */
public class JsonEncoder implements Encoder {
    @Override
    public byte[] encode(Object bean) {
        return JSON.toJSONBytes(bean);
    }
}
