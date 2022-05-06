package com.lyh.rpc.network.impl;

import com.lyh.rpc.factory.SingletonFactory;
import com.lyh.rpc.network.TransportClient;
import com.lyh.rpc.protocol.Peer;
import com.lyh.rpc.protocol.RpcRequest;
import com.lyh.rpc.provider.impl.DataInputStreamProvider;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/5 10:17 上午
 */
public class SocketTransportClientImpl implements TransportClient {

    private Socket socket;
    private DataInputStreamProvider dataInputStreamProvider;

    @Override
    public void connect(Peer peer) {
        try {
            socket = new Socket(peer.getHost(), peer.getPort());

            dataInputStreamProvider = SingletonFactory.getInstance(DataInputStreamProvider.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendRpcRequest(RpcRequest rpcRequest) {

    }

    @Override
    public void close() {
        if (socket.isConnected()) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        dataInputStreamProvider.closeAll();
    }

    public InputStream getStream(InetSocketAddress inetSocketAddress) throws IOException {
        InputStream stream = dataInputStreamProvider.getStream(inetSocketAddress);
        if (stream == null && socket.isConnected()) {
            InputStream inputStream = socket.getInputStream();
            dataInputStreamProvider.setStream(inetSocketAddress, inputStream);
        }
        return dataInputStreamProvider.getStream(inetSocketAddress);
    }
}
