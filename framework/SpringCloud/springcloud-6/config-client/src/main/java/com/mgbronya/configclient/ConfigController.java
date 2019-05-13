package com.mgbronya.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public ResponseEntity<String> getConfig() {
        return ResponseEntity.ok(profile);
    }

}
