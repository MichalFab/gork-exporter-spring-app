package net.devdiaries.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/")
    @ResponseBody
    public String sayHello(@RequestParam(defaultValue = "Guest") String name){
        logger.info("HelloController request from: " + name);
        return "Hello " + name;
    }
}
