package com.mgbronya.eurekacustomer.controller.hystrix;

import com.mgbronya.eurekacustomer.controller.remote.CustomerRemote;
import org.springframework.stereotype.Component;

@Component
public class CustomerHystrix implements CustomerRemote {
    @Override
    public String producer(String msg) {
        return "It's fail, Hello World!";
    }
}
