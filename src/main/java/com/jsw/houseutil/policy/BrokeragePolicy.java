package com.jsw.houseutil.policy;

import java.util.List;

import com.jsw.houseutil.exception.ErrorCode;
import com.jsw.houseutil.exception.HouseUtilException;

public interface BrokeragePolicy {

    List<BrokerageRule> getRules();

    default Long calculate (Long price) {
        BrokerageRule brokerageRule = getRules().stream()
                .filter(rule -> price < rule.getLessThan())
                .findFirst().orElseThrow(() -> new HouseUtilException(ErrorCode.INTERNAL_ERROR));

        return brokerageRule.calMaxBrokerage(price);
    }
    
}