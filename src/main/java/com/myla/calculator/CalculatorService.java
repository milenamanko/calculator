package com.myla.calculator;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public double performCalculation(double firstNum, double secondNum, OperationType operationType) {

        switch (operationType) {
            case ADD:
                return firstNum + secondNum;
            case SUBTRACT:
                return firstNum - secondNum;
            case MULTIPLE:
                return firstNum * secondNum;
            case DIVIDE:
                return firstNum / secondNum;
            default:
                throw new IllegalArgumentException("No operation type provided");
        }
    }
}
