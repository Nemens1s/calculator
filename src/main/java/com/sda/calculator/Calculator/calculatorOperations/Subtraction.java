package com.sda.calculator.Calculator.calculatorOperations;

import com.sda.calculator.Calculator.UserInput;

public class Subtraction implements Operation {
    @Override
    public double calculate(UserInput userInput) {
        double a = userInput.getX();
        double b = userInput.getY();
        return  a-b;
    }
}
