package com.example.springboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class GreetingController {

    private final String template = "<h1>Hello, %s!</h1>";
    private final AtomicLong counter = new AtomicLong();
    private final String defaultValue = "World";

    @GetMapping("/{name}")
    public String greeting(
            @PathVariable(value = "name") String value1
    ) {
        return String.format(template, value1);
    }
}
