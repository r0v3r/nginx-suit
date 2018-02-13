package com.foss.rover.agamenon.nginxsuit.domain.service;

public interface NginxSingleNodeReverseProxyService {
    String getConfig();
    void updateConfig(String config);
}
