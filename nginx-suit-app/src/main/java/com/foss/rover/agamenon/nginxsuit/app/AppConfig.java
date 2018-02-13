package com.foss.rover.agamenon.nginxsuit.app;

import com.foss.rover.agamenon.nginxsuit.domain.DomainConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DomainConfig.class)
public class AppConfig {
}
