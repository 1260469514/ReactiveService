package com.issues.userCenter.bootstrap;

import com.issues.userCenter.autoconfig.TestAutoConfiguration;
import lombok.extern.java.Log;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@Log
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserCenterConsumerBootStrap {

    public static void main(String[] args) {
//        SpringApplication.run(UserCenterConsumerBootStrap.class, args);
        ConfigurableApplicationContext context = new SpringApplicationBuilder(UserCenterConsumerBootStrap.class)
                .logStartupInfo(false)
                .web(WebApplicationType.REACTIVE)
                .headless(true)
                .run(args);
        TestAutoConfiguration testBean = context.getBean(TestAutoConfiguration.class);
        log.info(testBean.getClass().getName());
    }

}