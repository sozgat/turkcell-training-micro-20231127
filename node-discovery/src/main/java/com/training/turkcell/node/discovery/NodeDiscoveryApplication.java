package com.training.turkcell.node.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NodeDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NodeDiscoveryApplication.class, args);
    }

}
