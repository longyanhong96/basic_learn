package com.lyh.rpc.provider;

import java.io.InputStream;
import java.net.InetSocketAddress;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/5 10:28 上午
 */
public interface StreamProvider {
    /**
     * 获取流
     * @param <T>
     * @param inetSocketAddress
     * @return
     */
    <T> InputStream getStream(InetSocketAddress inetSocketAddress);

    /**
     * 设置stream
     * @param inetSocketAddress
     * @param stream
     */
    void setStream(InetSocketAddress inetSocketAddress,Object stream);

    /**
     * 移除stream
     * @param inetSocketAddress
     */
    void removeStream(InetSocketAddress inetSocketAddress);

    /**
     * 关闭所有的流
     */
    void closeAll();
}
