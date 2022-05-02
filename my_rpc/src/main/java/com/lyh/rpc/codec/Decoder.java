package com.lyh.rpc.codec;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 3:54 下午
 */
public interface Decoder {
    /**
     * 反序列化
     * @param bytes
     * @param className
     * @param <T>
     * @return
     */
    <T> T decode(byte[] bytes,Class<T> className);
}
