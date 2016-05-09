package com.vicboma._000_Hello_World.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vicboma on 09/05/16.
 */
@RestController
@EnableAutoConfiguration
public class ExampleController {

    public boolean isStarted;

    public ExampleController() {
        this.isStarted = true;
    }

    @RequestMapping("/")
    public String mapping_01() {
        return "Hello World: "+this.isStarted;
    }

}
