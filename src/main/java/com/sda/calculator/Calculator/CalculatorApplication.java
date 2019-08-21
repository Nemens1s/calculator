package com.sda.calculator.Calculator;


import com.sda.calculator.Calculator.calculatorOperations.CalculatorFactory;
import com.sda.calculator.Calculator.calculatorOperations.Operation;
import com.sda.calculator.Calculator.exceptions.CustomException;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		UserInput userInput = new UserInput();
		userInput.setNumbersFromUser();
		try {
			userInput.setOperation();
		} catch (CustomException e) {
			e.printStackTrace();
		}
		try {
			Operation operation = CalculatorFactory.getFactory(userInput);
			System.out.println(operation.calculate(userInput));
		} catch (CustomException e) {
			e.printStackTrace();
		}


	}

}
