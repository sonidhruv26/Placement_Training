package Practice_Questions;

public class MethodOverloading {
    static float n=23.45678f;

    void bark(){
        System.out.println("Hoof!!");
    }

    void bark(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hoof!!");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MethodOverloading obj1 = new MethodOverloading();
        obj1.bark();
        obj1.bark(3);
        System.out.format("%.2f",n);
    }

}
