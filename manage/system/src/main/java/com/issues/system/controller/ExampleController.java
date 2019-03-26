package com.issues.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ExampleController {

    @GetMapping(name = "Asyn", value = "/Asyn")
    public Mono<String> asynReq(@RequestParam(value = "id", required = false) String id) {
        Mono<String> mono;
        mono = Mono
                .justOrEmpty(id)
                .log("this.parameter ==>" + id);
        return mono;
    }
}
