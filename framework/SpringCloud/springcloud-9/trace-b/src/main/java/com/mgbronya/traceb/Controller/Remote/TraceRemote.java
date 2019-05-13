package com.mgbronya.traceb.Controller.Remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "trace-a")
public interface TraceRemote {

    @GetMapping("/trace-a")
    String traceProducer(@RequestParam String msg);

}
