package com.example.eurekaconsumerfeignhystrix.controller;

import com.example.eurekaconsumerfeignhystrix.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return helloRemote.hello(name + "!");
    }

}