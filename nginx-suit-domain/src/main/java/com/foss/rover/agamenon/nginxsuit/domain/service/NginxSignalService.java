package com.foss.rover.agamenon.nginxsuit.domain.service;

import com.foss.rover.agamenon.nginxsuit.domain.model.GeneralReturnCode;

public interface NginxSignalService {
    GeneralReturnCode reload();
    GeneralReturnCode reopen();
    GeneralReturnCode stop();
    GeneralReturnCode quit();
}
