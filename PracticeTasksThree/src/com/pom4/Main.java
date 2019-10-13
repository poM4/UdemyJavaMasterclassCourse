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

/*
        BankAccount iggyAccount = new BankAccount();
        iggyAccount.setAccountNumber("490375");
        iggyAccount.setBalance(1000.00);
        iggyAccount.setCustomerName("Iggy Romero");
        iggyAccount.setEmail("iggy.romero@test.com");
        iggyAccount.setPhoneNumber("+380979088822");

        System.out.println(iggyAccount.getBalance());
        iggyAccount.increaseBalance(500.00);
        iggyAccount.withdrawalBalance(2000);
        System.out.println(iggyAccount.getBalance());
        iggyAccount.withdrawalBalance(400);
        System.out.println(iggyAccount.getBalance());
*/
/*

        BankAccount annyaAccount = new BankAccount("12345", 0.00, "Hanna Dovgolap", "lzmnk@test.com", "+380971314444");
        BankAccount newAccount = new BankAccount();
*/
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Hanna", "lzmnk@test.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Igor", 30000, "iggy@test.com");
        System.out.println(person3.getName());

    }
}
