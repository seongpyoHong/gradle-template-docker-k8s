package sphong.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        System.out.println("API MODULE\n");
        SpringApplication.run(ApiApplication.class, args);
    }
}
