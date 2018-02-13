package com.foss.rover.agamenon.nginxsuit.domain.service;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class NginxSingleNodeReverseProxyServiceImpl implements NginxSingleNodeReverseProxyService {
    @Override
    public String getConfig() {
        try (BufferedReader reader = new BufferedReader(new FileReader("proxy.conf"))) {
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
            PrintWriter writer = new PrintWriter(new FileWriter("proxy.conf"));
            writer.write(config);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
