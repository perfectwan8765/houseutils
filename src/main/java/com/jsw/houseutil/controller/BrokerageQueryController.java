package com.jsw.houseutil.controller;

import com.jsw.houseutil.constants.ActionType;
import com.jsw.houseutil.policy.BrokeragePolicy;
import com.jsw.houseutil.policy.BrokeragePolicyFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage (@RequestParam ActionType actionType, @RequestParam Long price) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
    
}