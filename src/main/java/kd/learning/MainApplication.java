package kd.learning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.setProperty("server.tomcat.max-threads", "1");
        SpringApplication.run(MainApplication.class, args);
    }
}
