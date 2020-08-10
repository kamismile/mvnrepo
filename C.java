package c;
/**
 * LY.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.gitee.kamismile.stone.commmon.vertx.starter.EnableVertxService;
import com.gitee.kamismile.stoneComEx.common.EnableAppFlux;
import io.vertx.core.Vertx;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.hazelcast.HazelcastClusterManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import java.util.Properties;

/**
 * @author dong.li
 * @version $Id: c.C, v 0.1 2020/3/26 18:12 dong.li Exp $
 */
@SpringBootApplication(scanBasePackages = {"c", "com.max.*"}, exclude = {
        org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, IntegrationAutoConfiguration.class})
@EnableTransactionManagement
@ImportResource("classpath*:config/spring*.xml")
@MapperScan("com.max.system.mapper")
@EnableVertxService
//@EnableApp
//@EnableAppFlux
public class C {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(C.class).web(WebApplicationType.SERVLET).run(args);
        new SpringApplicationBuilder(C.class).web(WebApplicationType.NONE).run(args);

    }


    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
