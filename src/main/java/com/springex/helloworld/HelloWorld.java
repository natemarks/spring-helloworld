package com.springex.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloWorld {

    @Value("${RESPONSE_STRING}")
    private String response;

    @RequestMapping("/")
    public String Index()
    {

        return response;
    }
}
