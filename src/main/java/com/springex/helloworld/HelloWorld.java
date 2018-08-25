package com.springex.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

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
