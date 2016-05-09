package com.vicboma._001_Hello_World_Arguments.controller;

import com.vicboma._001_Hello_World_Arguments.model.Helloable;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vicboma on 09/05/16.
 */
@RestController
@EnableAutoConfiguration
public class ExampleControllerArguments {

    private static String template ;

    public ExampleControllerArguments() {
        template = "Hello, %s!";
    }
    @RequestMapping("/hello/{name}")
    public Helloable helloable(@PathVariable("name") String name) {
        return new Helloable(String.format(template, name));
    }
}

