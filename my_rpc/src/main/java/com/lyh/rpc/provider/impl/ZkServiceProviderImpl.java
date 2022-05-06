package com.lyh.rpc.provider.impl;

import com.lyh.rpc.network.RpcServerConfig;
import com.lyh.rpc.provider.ServiceProvider;
import com.lyh.rpc.registry.ServiceRegistry;

import javax.xml.ws.Service;
import java.util.Map;
import java.util.Set;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/6 5:53 下午
 */
public class ZkServiceProviderImpl implements ServiceProvider {


    /**
     * 已注册的service
     */
    private Map<String,Object> registeredServiceMap;

    /**
     * 已有服务名称
     */
    private Set<String> serviceNameSet;

    /**
     * 注册服务的类
     */
    private ServiceRegistry serviceRegistry;

    @Override
    public void addService(RpcServerConfig rpcServiceConfig) {

    }

    @Override
    public Object getService(String rpcServiceName) {
        return null;
    }

    @Override
    public void publishService(RpcServerConfig rpcServiceConfig) {

    }
}
