package com.issues.system.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public ReactiveWebServerFactoryCustomizer reactiveWebServerFactoryCustomizer(ServerProperties serverProperties){
        ReactiveWebServerFactoryCustomizer reactiveWebServer = new ReactiveWebServerFactoryCustomizer(serverProperties);
        NettyReactiveWebServerFactory nettyReactiveWebServerFactory = new NettyReactiveWebServerFactory();

        reactiveWebServer.customize(nettyReactiveWebServerFactory);
        return reactiveWebServer;
    }
}
