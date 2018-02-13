package com.foss.rover.agamenon.nginxsuit.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("")
    public String index(){
        return "index";
    }
}
