package com.foss.rover.agamenon.nginxsuit.app;

import com.foss.rover.agamenon.nginxsuit.domain.service.NginxSingleNodeReverseProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private NginxSingleNodeReverseProxyService reverseProxyService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/write")
    public String write(@RequestParam(value = "config")String config){

        reverseProxyService.updateConfig(config);
        return config;
    }

    @RequestMapping("/read")
    public String read(){

        return reverseProxyService.getConfig();
    }
}
