package com.sda.calculator.Calculator.calculatorOperations;


import com.sda.calculator.Calculator.Operations;
import com.sda.calculator.Calculator.UserInput;
import com.sda.calculator.Calculator.exceptions.CustomException;

public class CalculatorFactory {


    public static Operation getFactory(UserInput userInput) throws CustomException {

        Operations operations = userInput.getOperations();
        if(operations.equals(Operations.ADD)){
            return new Addition();
        } else if(operations.equals(Operations.SUB)){
            return new Subtraction();
        } else if (operations.equals(Operations.MUL)){
            return new Multiplication();
        } else if (operations.equals(Operations.DIV)){
            return new Division();
        } else {
            throw new CustomException("Currently we don't have this operation");
        }
    }


}
