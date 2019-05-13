package com.mgbronya.eurekacustomer.controller.remote;

import com.mgbronya.eurekacustomer.controller.hystrix.CustomerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "eureka-producer", fallback = CustomerHystrix.class)
public interface CustomerRemote {

    @GetMapping("/producer")
    String producer(@RequestParam String msg);

}
