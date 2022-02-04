package com.jsw.houseutil.policy;

import com.jsw.houseutil.constants.ActionType;
import com.jsw.houseutil.exception.ErrorCode;
import com.jsw.houseutil.exception.HouseUtilException;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of (ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new HouseUtilException(ErrorCode.INVALD_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
    
}