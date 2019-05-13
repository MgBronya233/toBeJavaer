package com.mgbronya.eurekacustomer.controller.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer")
public interface CustomerRemote {

    @GetMapping("/producer")
    String producer(@RequestParam String msg);

}
