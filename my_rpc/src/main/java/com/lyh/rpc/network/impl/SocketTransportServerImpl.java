package com.lyh.rpc.network.impl;

import com.lyh.rpc.network.TransportServer;
import com.lyh.rpc.utils.ThreadPoolFactoryUtil;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/6 5:29 下午
 */
public class SocketTransportServerImpl implements TransportServer {

    private String host;
    private final int port = 9999;

    private ServerSocket serverSocket;
    private ExecutorService threadPool;

    @Override
    public void init() {
        try {
            host = InetAddress.getLocalHost().getHostAddress();

            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(host, port));

            threadPool = ThreadPoolFactoryUtil.createCustomThreadPoolIfAbsent("socket-server-rpc-pool");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start() {

    }

    @Override
    public void close() {

    }
}
