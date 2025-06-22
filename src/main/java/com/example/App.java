package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/")
  public String hello() {
    return "Hello, Spring Boot!";
  }
}

