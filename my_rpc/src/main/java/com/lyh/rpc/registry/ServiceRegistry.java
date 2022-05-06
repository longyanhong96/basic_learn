package com.lyh.rpc.registry;

import java.net.InetSocketAddress;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/6 6:13 下午
 */
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc service name
     * @param inetSocketAddress service address
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);
}
