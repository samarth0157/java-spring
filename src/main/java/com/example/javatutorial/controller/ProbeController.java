package com.example.javatutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProbeController {
    private static final Logger log = LoggerFactory.getLogger(ProbeController.class);

    @GetMapping("/ok")
    public String ok() {
        log.info("OK endpoint called");
        return "ok";
    }

    @GetMapping("/slow")
    public String slow() throws InterruptedException {
        log.info("Slow endpoint called - simulating latency");
        Thread.sleep(1500);
        return "slow-done";
    }

    @GetMapping("/error")
    public String error() {
        log.warn("Error endpoint called - simulating failure");
        throw new RuntimeException("Simulated failure");
    }
}
