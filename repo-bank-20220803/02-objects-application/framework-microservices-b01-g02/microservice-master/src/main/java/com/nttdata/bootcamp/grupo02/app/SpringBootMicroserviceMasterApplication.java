package com.nttdata.bootcamp.grupo02.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceMasterApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceMasterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceMasterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Project");
    }

}
