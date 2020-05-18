package com.avs.jwtLearning.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloResourse {
    
    @GetMapping(value="/heloo")
    public String getString() {
        return "helooo";
    }
    
}