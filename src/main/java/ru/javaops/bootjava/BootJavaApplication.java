package ru.javaops.bootjava;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javaops.bootjava.repository.UserRepository;

@SpringBootApplication
public class BootJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJavaApplication.class, args);
    }
}
