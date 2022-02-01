package com.jsw.houseutil.controller;

import com.jsw.houseutil.constants.ActionType;
import com.jsw.houseutil.policy.BrokeragePolicy;
import com.jsw.houseutil.policy.BrokeragePolicyFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  중계 수수료가 얼마인지 조회하는 컨트롤러
 */
@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage (@RequestParam ActionType actionType, @RequestParam Long price) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
    
}