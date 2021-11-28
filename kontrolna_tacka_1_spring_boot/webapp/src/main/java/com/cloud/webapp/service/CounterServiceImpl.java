package com.cloud.webapp.service;

import com.cloud.webapp.model.Counter;
import com.cloud.webapp.repository.CounterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CounterServiceImpl implements CounterService {

    private final CounterRepository counterRepository;

    @Override
    public List<Counter> getCounters() {
        updateCounterForEndpoint("GET", "counters");
        return counterRepository.findAll();
    }

    @Override
    public void updateCounterForEndpoint(String method, String endpoint) {
        Optional<Counter> optCounter = counterRepository.findByMethodAndEndpoint(method, endpoint);
        Counter counter = new Counter(null, method, endpoint, 1L);
        if(optCounter.isPresent()){
            counter = optCounter.get();
            counter.increaseCounter();
        }
        counterRepository.save(counter);
    }

}
