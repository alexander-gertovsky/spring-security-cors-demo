package com.example.springsecuritycorsdemo.web;

import com.example.springsecuritycorsdemo.web.beans.HelloWorldResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    static final String REST_PATH = "api/rest";

    @GetMapping(REST_PATH + "/hello")
    public ResponseEntity<HelloWorldResponse> hello() {
        final var resultBody = new HelloWorldResponse();
        resultBody.setAnswer("Hello World!");
        return ResponseEntity.ok(resultBody);
    }
}
