package com.pom4;

public class Main {

    public static void main(String[] args) {
/*
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
*/
/*
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
*/


        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("490375");
        bankAccount.setBalance(1000.00);
        bankAccount.setCustomerName("Iggy Romero");
        bankAccount.setEmail("iggy.romero@test.com");
        bankAccount.setPhoneNumber("+380979088822");

        System.out.println(bankAccount.getBalance());
        bankAccount.increaseBalance(500.00);
        bankAccount.withdrawalBalance(2000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawalBalance(400);
        System.out.println(bankAccount.getBalance());


    }
}
