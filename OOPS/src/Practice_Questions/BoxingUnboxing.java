package Practice_Questions;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int i2 = 10;
        Integer i1 = Integer.valueOf(i2);    //Boxing
        int i = i1.intValue();    //Unboxing
        System.out.println(i);
    }
}
