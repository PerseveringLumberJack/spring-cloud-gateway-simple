package com.example.springcloud.gatewaysimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteDefinition;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewaySimpleApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudGatewaySimpleApplication.class, args);
    }

}
