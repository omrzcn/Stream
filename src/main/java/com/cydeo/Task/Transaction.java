package com.cydeo.Task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Transaction {
    private Trader trader;
    private  int year;
    private int value;

}
