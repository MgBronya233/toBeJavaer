package com.example.eurekaconsumerfeignhystrix.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "Hello World!";
    }
}
