package com.sda.calculator.Calculator;


import com.sda.calculator.Calculator.exceptions.CustomException;

import java.util.Scanner;

public class UserInput {

    private double x;
    private double y;
    private Operations operations;
    private Scanner scanner = new Scanner(System.in);


    public void setOperation()  throws CustomException{


        System.out.println("Enter what you want to do? ");
        String input = scanner.next();
        if(hasOperation(input)){
            this.operations = Operations.valueOf(input);
        } else {
            throw new CustomException("We don't have this operation yet");
        }

    }

    public Operations getOperations() {
        return operations;
    }

    public void setNumbersFromUser(){

        System.out.println("Enter first number: ");
        this.x = scanner.nextDouble();

        System.out.println("Enter second number: ");
        this.y = scanner.nextDouble();
    }

    public boolean hasOperation(String input){
        for (Operations e : Operations.values()) {
            if (e.name().equals(input)) {
                return true;
            }
        }
        return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
