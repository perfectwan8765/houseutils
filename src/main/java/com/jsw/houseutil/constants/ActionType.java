package com.jsw.houseutil.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActionType {
    PURCHASE("매매"),
    RENT("임대");

    private String description;
    
}
