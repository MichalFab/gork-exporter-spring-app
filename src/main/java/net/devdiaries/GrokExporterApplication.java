package net.devdiaries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GrokExporterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrokExporterApplication.class, args);
    }

}
