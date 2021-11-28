package com.cloud.webapp.service;

import com.cloud.webapp.model.Counter;

import java.util.List;

public interface CounterService {
    List<Counter> getCounters();

    void updateCounterForEndpoint(String method, String endpoint);
}
