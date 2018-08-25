package com.springex.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @Autowired
    private Config config;

    @RequestMapping("/")
    public String Index()
    {
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        return config.getResponse();
    }
}
