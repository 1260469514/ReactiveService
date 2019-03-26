package com.issues.system.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.DispatcherHandler;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.ViewResolverRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.result.view.View;
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerView;
import org.springframework.web.server.WebHandler;

@Configuration
public class WebConfig implements WebFluxConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    }
}
