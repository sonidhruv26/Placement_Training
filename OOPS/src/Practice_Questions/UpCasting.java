package Practice_Questions;

class Parent{
    void display(){
        System.out.println(1);
    }
    void childMethod(){}
}

class c1 extends Parent{
    void display(){
        System.out.println(2);
    }
    void childMethod(){
        System.out.println(3);
    }
}

class c2 extends Parent{
    void display(){
        System.out.println(4);
    }
    void childMethod(){
        System.out.println(5);
    }
}

public class UpCasting{

    static void print(Parent obj){
        obj.childMethod();
    }

    public static void main(String[] args) {
        Parent obj = new c2();      //Up-Casting
        //    obj.display();              //Output: 4
        //    obj.c1Method();           //Error
        c1 obj2 = new c1();
        print(obj2);
        c2 obj3 = new c2();
        print(obj3);
    }
}
