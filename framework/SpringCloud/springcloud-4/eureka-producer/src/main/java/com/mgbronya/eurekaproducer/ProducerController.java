package com.mgbronya.eurekaproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProducerController {

    @Value("${instance:000}")
    private String instance;

    @GetMapping("/producer")
    public String producer(@RequestParam String msg) {
        return "[" + instance + "]" + "Producer <" + msg + "> " + new Date();
//        return "Producer <" + msg + "> " + new Date();
    }

}
