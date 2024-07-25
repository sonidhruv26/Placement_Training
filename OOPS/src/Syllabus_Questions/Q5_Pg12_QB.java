package Syllabus_Questions;

import java.util.Scanner;

public class Q5_Pg12_QB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = 0;
        }

        System.out.println("Enter String: ");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            int x;
            if((int)str.charAt(i) <= 90 && (int)str.charAt(i) >= 65){
                x = (int)str.charAt(i) + 32;
            }
            x = ((int)str.charAt(i)-97);
            arr[x]++;
//            System.out.println("x:"+x+" count:"+arr[x]);

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                System.out.println("Char:"+(char)(i+97)+" | Occurrence: "+arr[i]);
            }
        }
    }
}
