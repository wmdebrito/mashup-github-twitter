package com.wmdebrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by DELL-WAGNER on 16-Aug-16.
 */
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args).close();
    }
}
