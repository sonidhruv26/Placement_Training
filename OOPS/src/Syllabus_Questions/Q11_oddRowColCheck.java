package Syllabus_Questions;

import java.util.Scanner;

public class Q11_oddRowColCheck{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];

        System.out.println("Enter elements");
        for(int i=0; i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Row-check
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 1)
                    count++;
            }
            if(count % 2 != 0){
                System.out.println("Row-"+i+" has odd number of 1's.");
            }
            else{
                System.out.println("Row-"+i+" has even number of 1's.");
            }
        }

        //Column-check
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == 1)
                    count++;
            }
            if(count % 2 != 0){
                System.out.println("Column-"+i+" has odd number of 1's.");
            }
            else{
                System.out.println("Column-"+i+" has even number of 1's.");
            }
        }
    }
}