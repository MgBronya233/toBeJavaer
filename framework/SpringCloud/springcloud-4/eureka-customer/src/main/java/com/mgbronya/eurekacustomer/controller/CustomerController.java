package com.mgbronya.eurekacustomer.controller;

import com.mgbronya.eurekacustomer.controller.remote.CustomerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRemote customerRemote;

    @GetMapping("/customer")
    public String producer(@RequestParam String msg) {
        return customerRemote.producer("{Customer} " + msg);
    }
}
