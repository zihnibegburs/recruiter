package com.crypto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    public int makerCommission;
    public int takerCommission;
    public int buyerCommission;
    public int sellerCommission;
    public CommissionRates commissionRates;
    public boolean canTrade;
    public boolean canWithdraw;
    public boolean canDeposit;
    public boolean brokered;
    public boolean requireSelfTradePrevention;
    public long updateTime;
    public String accountType;
    public ArrayList<Balance> balances;
    public ArrayList<String> permissions;
}
