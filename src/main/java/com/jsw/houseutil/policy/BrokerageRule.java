package com.jsw.houseutil.policy;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;

/**
 * 가격이 특정 범위일때 상한요율과 상한금액을 가지는 클래스
 */
@AllArgsConstructor
public class BrokerageRule {

    private Double brokeragePercent;
    
    @Nullable
    private Long limitAmount;

    public Long calMaxBrokerage (Long price) {
        if (limitAmount == null) {
            return multiplyPercent(price);
        }

        return Math.min(multiplyPercent(price), limitAmount);
    }

    private Long multiplyPercent(Long price) {
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
    
}