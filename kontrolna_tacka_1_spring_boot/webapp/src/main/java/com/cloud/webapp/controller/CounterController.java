package com.cloud.webapp.controller;

import com.cloud.webapp.model.Counter;
import com.cloud.webapp.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "counters")
@RequiredArgsConstructor
public class CounterController {

    private final CounterService counterService;

    @GetMapping
    public List<Counter> getCounters(){
        return counterService.getCounters();
    }
}
