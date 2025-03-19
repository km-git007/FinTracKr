package com.fintrackr.dto;

import lombok.Data;

@Data
public class AccountDTO {
    private String name;
    private double balance;
    private boolean isDefault;
}
