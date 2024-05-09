package com.husu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huyong(husu)
 * @date 5/9/2024 5:14 PM
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("demo")
    public String demo() {
        return "hello";
    }
}
