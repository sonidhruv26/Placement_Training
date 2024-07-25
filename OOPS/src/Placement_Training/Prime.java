package Placement_Training;

import java.util.Scanner;

public class Prime {

    public static boolean checkPrime (int num) {
        if(num < 0){
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt((double) num); i++) {
            if(num % (i) == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to check Prime: ");
        int number = scan.nextInt();

        if(number > 0) {
            if(checkPrime(number)) {
                System.out.println("Number is Prime.");
            } else {
                System.out.println("Number is not Prime");
            }
        } else {
            System.out.println("Number is invalid. Please enter valid number.");
        }
    }
}
