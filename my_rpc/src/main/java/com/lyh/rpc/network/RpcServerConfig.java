package com.lyh.rpc.network;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/5/6 4:53 下午
 */
@Data
public class RpcServerConfig {

    private String groupId = "";

    private String version = "";

    private Set<Object> serviceSet = new HashSet<>();

    public List<String> getRpcServiceListName() {
        if (serviceSet.isEmpty()) {
            return null;
        } else {
            List<String> serviceNameList = new ArrayList<>();
            serviceSet.forEach(service -> {
                serviceNameList.add(getServiceName(service));
            });
            return serviceNameList;
        }
    }

    public String getServiceName(Object service) {
        return service.getClass().getInterfaces()[0].getCanonicalName();
    }
}
