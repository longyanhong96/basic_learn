package com.lyh.rpc.provider.impl;

import com.lyh.rpc.provider.StreamProvider;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/5 10:40 上午
 */
@Slf4j
public class DataInputStreamProvider implements StreamProvider {

    private Map<String, InputStream> inputStreamMap;

    public DataInputStreamProvider() {
        this.inputStreamMap = new ConcurrentHashMap<>();
    }

    @Override
    public <T> InputStream getStream(InetSocketAddress inetSocketAddress) {
        String key = inetSocketAddress.toString();
        if (inputStreamMap.containsKey(key)) {
            InputStream inputStream = inputStreamMap.get(key);
            if (inputStream != null) {
                return inputStream;
            } else {
                removeStream(inetSocketAddress);
            }
        }
        return null;
    }

    @Override
    public void setStream(InetSocketAddress inetSocketAddress, Object stream) {
        String key = inetSocketAddress.toString();
        if (stream instanceof InputStream) {
            inputStreamMap.put(key, (InputStream) stream);
        }
    }

    @Override
    public void removeStream(InetSocketAddress inetSocketAddress) {
        String key = inetSocketAddress.toString();
        if (inputStreamMap.containsKey(key)) {
            InputStream inputStream = inputStreamMap.remove(key);
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void closeAll() {
        if (inputStreamMap.size() > 0) {
            inputStreamMap.keySet().forEach(key -> {
                try {
                    InputStream inputStream = inputStreamMap.remove(key);
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }
    }
}
