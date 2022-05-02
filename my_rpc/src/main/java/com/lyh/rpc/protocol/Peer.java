package com.lyh.rpc.protocol;

import lombok.Data;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/29 4:14 下午
 */
@Data
public class Peer {
    private String host;
    private int port;
}
