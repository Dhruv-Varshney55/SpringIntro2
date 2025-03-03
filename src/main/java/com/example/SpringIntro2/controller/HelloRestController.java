package com.example.SpringIntro2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    // UC1
    // http://localhost:8080/put/Dhruv?lastName=Varshney

    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        logger.info("Received request: firstName={}, lastName={}", firstName, lastName);

        String message = "Hello " + firstName + " " + lastName + "!";

        logger.debug("Generated message: {}", message);
        return message;
    }


}
