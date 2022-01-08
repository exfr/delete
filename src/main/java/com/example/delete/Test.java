package com.example.delete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String test() {
        System.out.println("OOOOooOoOoOoooOookaaaAAAaaaAaAayyyyy!");
        return "Response its OK!";
    }
}
