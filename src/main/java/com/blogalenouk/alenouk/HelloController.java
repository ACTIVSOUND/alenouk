package com.blogalenouk.alenouk;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "УРРРРРАААААА а ведь все получилось!";
    }

}