package com.wmdebrito.cli;


import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLIRunner implements CommandLineRunner {

    @Autowired
    ProducerTemplate template;

    public void run(String... args) {
        template.sendBody("direct:gitHubRepo", "Reactive");
    }
}