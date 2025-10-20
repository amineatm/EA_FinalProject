package edu.miu.blog.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.miu.blog")
public class MiuBlogBackendApplication {

    public static void main(String[] args) {
        System.out.println("Classpath: _______________ " + System.getProperty("java.class.path"));
        SpringApplication.run(MiuBlogBackendApplication.class, args);
    }
}
