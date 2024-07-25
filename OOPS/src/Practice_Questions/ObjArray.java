package Practice_Questions;

class Circle{

    Circle (int n){
        System.out.println("Object-"+n+" is created.");
    }
    void CircleArea(int r){
        double area = Math.PI * r * r;
        System.out.print("Area is ");
        System.out.format("%.2f",area);
        System.out.println();
    }
}
public class ObjArray {
    public static void main(String[] args) {
        Circle[] c = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(i+1);
            c[i].CircleArea(i);
        }
    }
}
