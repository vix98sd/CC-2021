package com.cloud.webapp.controller;

import com.cloud.webapp.model.Counter;
import com.cloud.webapp.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "counters")
@RequiredArgsConstructor
public class CounterController {

    private final CounterService counterService;

    @Value("${hello-message}")
    private String helloMessage;

    @GetMapping
    public Map<String,List<Counter>> getCounters(){
        return Map.of(helloMessage, counterService.getCounters());
    }
}
