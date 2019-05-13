package com.mgbronya.traceb.Controller;

import com.mgbronya.traceb.Controller.Remote.TraceRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceController {

    @Autowired
    TraceRemote traceRemote;

    @GetMapping("/trace-b")
    public String traceProducer(@RequestParam String msg) {
        return traceRemote.traceProducer("trace-b " + msg);
    }

}
