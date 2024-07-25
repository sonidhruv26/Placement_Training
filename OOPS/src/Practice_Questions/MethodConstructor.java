package Practice_Questions;

public class MethodConstructor {
    int radius;
    static int NumberOfObjects = 0;

     MethodConstructor(){
        NumberOfObjects++;
        radius = 10;
    }

    MethodConstructor(int r){
        NumberOfObjects++;
        radius = r;
    }

    void printRadius() {
        System.out.println(radius);
    }

    public static void main(String[] args) {
        MethodConstructor obj1 = new MethodConstructor();
        obj1.printRadius();
        System.out.println(NumberOfObjects);
        MethodConstructor obj2 = new MethodConstructor();
        System.out.println(NumberOfObjects);
        System.out.println(new MethodConstructor(20).NumberOfObjects);
        obj1.printRadius();
    }
}
