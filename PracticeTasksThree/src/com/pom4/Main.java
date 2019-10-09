package com.pom4;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(10);
        simpleCalculator.setSecondNumber(5);
        System.out.println(simpleCalculator.getAdditionResult());

    }
}
