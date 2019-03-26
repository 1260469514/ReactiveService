package com.issues.system.config;

import org.springframework.beans.factory.annotation.Value;

public class DataSourceConfig {

    @Value("mysql.url")
    private String url;

    @Value("mysql.username")
    private String userName;

    @Value("mysql.password")
    private String password;

}
