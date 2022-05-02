package com.lyh.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 3:58 下午
 */
public class JsonDecoder implements Decoder {

    @Override
    public <T> T decode(byte[] bytes, Class<T> className) {
        return JSON.parseObject(bytes, className);
    }
}
