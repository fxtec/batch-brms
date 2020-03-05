package com.example.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.batchprocessing","output.web.servicos"})
public class BatchProcessingApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BatchProcessingApplication.class, args);
    }
}
