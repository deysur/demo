//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController

public class demoprod {
    @GetMapping("/demoprod")
    public String getData() {
        return "This is my prod branch";
    }
}
