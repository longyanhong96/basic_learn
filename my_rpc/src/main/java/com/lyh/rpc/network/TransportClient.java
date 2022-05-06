package com.lyh.rpc.network;

import com.lyh.rpc.protocol.Peer;
import com.lyh.rpc.protocol.RpcRequest;

import java.io.InputStream;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 4:15 下午
 */
public interface TransportClient {
    /**
     * 连接
     *
     * @param peer
     */
    void connect(Peer peer);

    /**
     * 发送数据
     *
     * @param rpcRequest
     */
    void sendRpcRequest(RpcRequest rpcRequest);

    /**
     * 关闭连接
     */
    void close();
}
