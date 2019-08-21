package com.sda.calculator.Calculator.calculatorOperations;

import com.sda.calculator.Calculator.UserInput;
import com.sda.calculator.Calculator.exceptions.CustomException;

public class Division implements Operation {
    @Override
    public double calculate(UserInput userInput)  throws CustomException{
        double a = userInput.getX();
        double b = userInput.getY();

        if(a > 0){
            return a/b;
        } else {
            throw new CustomException("You are trying to divide a zero!");
        }
    }
}
