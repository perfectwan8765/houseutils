package com.jsw.houseutil.policy;

import com.jsw.houseutil.constants.ActionType;
import com.jsw.houseutil.exception.ErrorCode;
import com.jsw.houseutil.exception.HouseUtilException;

public class BrokeragePolicyFactory {

    private static final RentBrokeragePolicy rentBrokeragePolicy = new RentBrokeragePolicy();
    private static final PurchaseBrokeragePolicy purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();

    public static BrokeragePolicy of (ActionType actionType) {
        switch (actionType) {
            case RENT:
                return rentBrokeragePolicy;
            case PURCHASE:
                return purchaseBrokeragePolicy;
            default:
                throw new HouseUtilException(ErrorCode.INVALD_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
    
}