package com.foss.rover.agamenon.nginxsuit.domain.service;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class NginxSingleNodeReverseProxyServiceImpl implements NginxSingleNodeReverseProxyService {
    static final String PROXY_CONF_FILE = "/etc/nginx/suit-conf/proxy.conf";
    @Override
    public String getConfig() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PROXY_CONF_FILE))) {
            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            while(line != null ){
                builder.append(line+String.valueOf("\n"));
                line = reader.readLine();
            }
            reader.close();
            return builder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void updateConfig(String config) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(PROXY_CONF_FILE));
            writer.write(config);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
