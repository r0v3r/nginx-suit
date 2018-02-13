package com.foss.rover.agamenon.nginxsuit.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
public class ProxyConfig {
//    config name should be unit
    @Getter @Setter private String configName;
    @Getter @Setter private int portListening;
    @Getter @Setter private String serverName;
    @Getter @Setter private List<Location> locationMapping;

    public class Location{
        @Getter @Setter private String pattern;
        @Getter @Setter private String proxyIp;
        @Getter @Setter private String proxyPort;
    }
}
