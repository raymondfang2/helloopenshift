package com.example.shift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiftController {
    @GetMapping("/")
    String home() {
        return "<body style=\"background-color:green;\">Hello Openshift!</body>";
    }
}
