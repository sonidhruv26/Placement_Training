package Practice_Questions;

import java.util.Random;

public class MarksCompare {
    int java, coa, os;
    static boolean compare(MarksCompare s1, MarksCompare s2){
        if(s1.java == s2.java && s1.java == s2.java && s1.java == s2.java)
            return true;
        else
            return false;
    }

    boolean compareWith(MarksCompare s){
        return (java == s.java && coa == s.coa && os == s.os);
    }

    public static void main(String[] args) {
        MarksCompare[] s = new MarksCompare[3];
        Random ran = new Random(10);
        for (int i = 0; i < s.length; i++) {
            s[i] = new MarksCompare();
            s[i].java = /*ran.nextInt(50) + */ 10;
            s[i].coa = /*ran.nextInt(50) + */ 10;
            s[i].os = /*ran.nextInt(50) + */ 10;
        }
        System.out.println("Marks: ");
        System.out.println("Java  " + "COA  " + "OS ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].java + "    " + s[i].coa + "   " + s[i].os);
        }
        for (int i = 0; i < s.length - 1; i++) {
            if(compare(s[i], s[i + 1]))
                System.out.println("Marks are same of Student-"+(i+1)+" and Student- "+(i+2));
        }
        for (int i = 0; i < s.length - 1; i++) {
            System.out.println(s[i].compareWith(s[i+1]));
        }
    }
}
