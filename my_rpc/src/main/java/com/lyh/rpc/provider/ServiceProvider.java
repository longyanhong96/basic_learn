package com.lyh.rpc.provider;

import com.lyh.rpc.network.RpcServerConfig;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/6 5:50 下午
 */
public interface ServiceProvider {
    /**
     * 添加服务内存中
     *
     * @param rpcServiceConfig rpc service related attributes
     */
    void addService(RpcServerConfig rpcServiceConfig);

    /**
     * 获取服务
     *
     * @param rpcServiceName rpc service name
     * @return service object
     */
    Object getService(String rpcServiceName);

    /**
     * 添加服务到注册中心
     *
     * @param rpcServiceConfig rpc service related attributes
     */
    void publishService(RpcServerConfig rpcServiceConfig);
}
