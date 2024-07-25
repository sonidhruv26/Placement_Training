package Practice_Questions;

import java.util.Random;

public class StudentMarks {
    int[] sub=new int[3];

    public static void main(String[] args) {
        StudentMarks[] s = new StudentMarks[3];
        Random ran = new Random();
        for(int i=0; i<s.length; i++){
            s[i] = new StudentMarks();
         for(int j =0 ; j<s[i].sub.length;j++)
            s[i].sub[j] = ran.nextInt(50)+10;
            }
        System.out.println("Marks: ");
        System.out.println("Java\t"+"COA\t\t"+"OS\t");
        for(int i=0; i<s.length; i++){
            for (int j = 0; j < s[i].sub.length; j++) {
                System.out.print(s[i].sub[j] +"\t\t");
            }
            System.out.println();
        }
    }

//    int java, coa, os;
//
//    public static void main(String[] args) {
//        test[] s = new test[3];
//        Random ran = new Random();
//        for(int i=0; i<s.length; i++){
//            s[i] = new test();
//            s[i].java = ran.nextInt(50)+10;
//            s[i].coa = ran.nextInt(50)+10;             Java OS COA
//            s[i].os = ran.nextInt(50)+10;              10   20 30
//        }                                              20   30 40
//        System.out.println("Marks: ");
//        System.out.println("Java  "+"COA  "+"OS ");
//        for(int i=0; i<s.length; i++){
//            System.out.println(s[i].java + "    " + s[i].coa+"   " + s[i].os);
//        }
//    }
}
