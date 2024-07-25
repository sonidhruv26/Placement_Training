package Placement_Training;

import java.util.Scanner;

public class Day3_TaxCalc_24_09_24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your gender:");
        String gender = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your income:");
        int income = scan.nextInt();

        Person person = new Person(name,gender,age,income);
        TaxCalculator tax = new TaxCalculator();

        tax.calcTax(person);
        System.out.println("Total tax = "+person.getTax());
    }
}
