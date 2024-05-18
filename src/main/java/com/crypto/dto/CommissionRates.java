package com.crypto.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommissionRates{
    public String maker;
    public String taker;
    public String buyer;
    public String seller;
}
