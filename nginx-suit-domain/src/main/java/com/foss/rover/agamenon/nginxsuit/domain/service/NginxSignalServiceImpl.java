package com.foss.rover.agamenon.nginxsuit.domain.service;

import com.foss.rover.agamenon.nginxsuit.domain.model.GeneralReturnCode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class NginxSignalServiceImpl implements NginxSignalService {
    @Override
    public GeneralReturnCode reload() {
        try {
            Runtime.getRuntime().exec("nginx -s reload");
            return GeneralReturnCode.RET_CODE_SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
            return GeneralReturnCode.RET_CODE_ERROR;
        }
    }

    @Override
    public GeneralReturnCode reopen() {
        try {
            Runtime.getRuntime().exec("nginx -s reopen");
            return GeneralReturnCode.RET_CODE_SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
            return GeneralReturnCode.RET_CODE_ERROR;
        }
    }

    @Override
    public GeneralReturnCode stop() {
        try {
            Runtime.getRuntime().exec("nginx -s stop");
            return GeneralReturnCode.RET_CODE_SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
            return GeneralReturnCode.RET_CODE_ERROR;
        }
    }

    @Override
    public GeneralReturnCode quit() {
        try {
            Runtime.getRuntime().exec("nginx -s quit");
            return GeneralReturnCode.RET_CODE_SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
            return GeneralReturnCode.RET_CODE_ERROR;
        }
    }
}
