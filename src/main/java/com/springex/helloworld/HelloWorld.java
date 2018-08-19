package com.springex.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloWorld {

    @Autowired
    private Config config;

    @RequestMapping("/")
    public String Index()
    {

        return config.getResponse();
    }
}
