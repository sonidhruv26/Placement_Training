package Practice_Questions;

class P{
    P(){
        System.out.println("In P");
    }
}

public class ConstructorChaining extends P {
    ConstructorChaining(){
        System.out.println("In C1");
    }

    public static void main(String[] args) {
        new ConstructorChaining();
        // Here both Parent Constructor and Child constructor
        // is called even if only child class reference is given.x
    }
}

