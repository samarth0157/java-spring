

package com.example.javatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.javatutorial")
public class JavaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTutorialApplication.class, args);
    }
}
