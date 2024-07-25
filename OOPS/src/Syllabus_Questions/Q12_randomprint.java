package Syllabus_Questions;

import java.util.Random;

public class Q12_randomprint {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i=0; i<100; i++){
            System.out.println(random.nextInt(50));
        }
        int[] arr = new int[1000];
        int count=0;
        for (int i : arr) {
            arr[i] = random.nextInt(50);
            if(count>=100)
                break;
            if(arr[i] >=0 && arr[i] <= 49){
                System.out.println(arr[i]);
                count++;
            }
        }
    }
}
