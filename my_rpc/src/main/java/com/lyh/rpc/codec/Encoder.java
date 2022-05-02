package com.lyh.rpc.codec;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 3:53 下午
 */
public interface Encoder {
    /**
     * 序列化
     * @param bean
     * @return
     */
    byte[] encode(Object bean);
}
