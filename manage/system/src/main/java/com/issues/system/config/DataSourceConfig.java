package com.issues.system.config;

import com.github.jasync.r2dbc.mysql.JasyncClientConnection;
import com.github.jasync.sql.db.Configuration;
import com.github.jasync.sql.db.Connection;
import com.github.jasync.sql.db.mysql.pool.MySQLConnectionFactory;
import com.github.jasync.sql.db.pool.ConnectionPool;
import com.github.jasync.sql.db.pool.PoolConfiguration;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

public class DataSourceConfig {

    @Value("mysql.url")
    private String url;

    @Value("mysql.username")
    private String userName;

    @Value("mysql.password")
    private String password;

    public void r2dbc() {

        PoolConfiguration poolConfiguration = new PoolConfiguration(
                100,
                TimeUnit.MINUTES.toMillis(15),
                10_000,
                TimeUnit.SECONDS.toMillis(30)
        );


//        Connection connectionPool = new JasyncClientConnection(new MySQLConnectionFactory(
//                new Configuration(userName, password)
//        ),poolConfiguration).connect().get();
    }
}
