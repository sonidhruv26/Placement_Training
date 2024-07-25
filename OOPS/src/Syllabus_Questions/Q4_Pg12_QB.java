package Syllabus_Questions;

class Figure{
    int x, y;
    double area (){ return -1; }
}

class rectangle extends Figure{
    rectangle(int len, int breath){
        x = len;
        y = breath;
    }
    double area(){
        return x * y;
    }
}

class Triangle extends Figure{
    Triangle(int height, int base){
        x = height;
        y = base;
    }
    double area(){
        return (0.5 * x * y);
    }
}
public class Q4_Pg12_QB {
    public static void printArea(Figure f){
        if(f instanceof rectangle){
            System.out.println("Rectangle area: "+f.area());
        }
        if(f instanceof Triangle){
            System.out.println("Triangle area: "+f.area());
        }
    }

    public static void main(String[] args) {
        Figure f1 = new rectangle(10,20);
        printArea(f1);
        f1 = new Triangle(20,30);
        printArea(f1);
    }
}
