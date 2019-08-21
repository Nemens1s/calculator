package com.sda.calculator.Calculator.calculatorOperations;

import com.sda.calculator.Calculator.UserInput;
import com.sda.calculator.Calculator.exceptions.CustomException;

public interface Operation {

    double calculate(UserInput userInput) throws CustomException;


}
