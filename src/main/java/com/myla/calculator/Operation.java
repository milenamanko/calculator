package com.myla.calculator;

import lombok.Data;

@Data
public class Operation {

    private double firstNum;
    private double secondNum;
    private OperationType operationType;
}
