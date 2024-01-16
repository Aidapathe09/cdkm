package com.cdkm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String hello() {
        return "GESARCHIV";
    }

    CommandLineRunner() {}
    public void run() {string arg}

}
