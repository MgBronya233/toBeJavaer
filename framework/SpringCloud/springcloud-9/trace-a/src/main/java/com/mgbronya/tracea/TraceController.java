package com.mgbronya.tracea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TraceController {

    @GetMapping("/trace-a")
    public String traceProducer(@RequestParam String msg) {
        return "trace-a {" + msg + "} " + new Date();
    }

}