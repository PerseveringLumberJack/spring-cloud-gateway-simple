package com.example.springcloud.gatewaysimple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    private final String FALLBACK_MESSAGE = "SERVICE CALL FAILED";

    @RequestMapping(value = "/fallback")
    public String fallback() {
        return FALLBACK_MESSAGE;
    }
}
