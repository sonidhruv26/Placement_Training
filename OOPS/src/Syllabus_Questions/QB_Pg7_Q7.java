package Syllabus_Questions;

class Rectangle{
    double x, y;
    double w, h;
    Rectangle(){
        x = y = 0;
        w = h = 0;
    }
    Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        w = width;
        h = height;
    }
    double getArea(){
        return w*h;
    }
    double getPerimeter(){
        return 2*(w+h);
    }
    boolean contains(double x, double y){
        return (this.x < w && this.y < h && this.x > 0 && this.y > 0);
    }
}
public class QB_Pg7_Q7 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(2,3,6,5);

        System.out.println("Rec-1 Area: " + rec1.getArea());
        System.out.println("Rec-1 Perimeter: " + rec1.getPerimeter());

        if(rec1.contains(0.5,0.5))
            System.out.println("Inside Rectangle-1.");
        else
            System.out.println("Outside Rectangle-1.");

        System.out.println("Rec-2 Area: " + rec2.getArea());
        System.out.println("Rec-2 Perimeter: " + rec2.getPerimeter());

        if(rec2.contains(3,4))
            System.out.println("Inside Rectangle-2.");
        else
            System.out.println("Outside Rectangle-2.");
    }
}
