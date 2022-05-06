package com.lyh.rpc.network;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 4:52 下午
 */
public interface TransportServer {
    /**
     * 初始化
     */
    void init();

    /**
     * 开始服务
     */
    void start();

    /**
     * 关闭服务
     */
    void close();
}
