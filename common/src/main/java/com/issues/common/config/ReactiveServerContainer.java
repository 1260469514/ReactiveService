package com.issues.common.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryCustomizer;

public class ReactiveServerContainer extends ReactiveWebServerFactoryCustomizer {

    public ReactiveServerContainer(ServerProperties serverProperties) {
        super(serverProperties);

    }

}
