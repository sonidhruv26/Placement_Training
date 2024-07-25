package Practice_Questions;

class Animals{}
class Dog extends Animals{
    void sound(){
        System.out.println("Woof!!");
    }
}

class Cat extends Animals{
    void sound(){
        System.out.println("Meow!!");
    }
}

class Drashti extends Animals{
    void sound(){
        System.out.println("Hoop!!");
    }
}
public class DownCasting {
    static void print(Animals obj){
        if (obj instanceof Dog){
            Dog objD = (Dog) obj;
            objD.sound();
        }
        if (obj instanceof Cat){
            Cat objC = (Cat) obj;
            objC.sound();
        }
        if (obj instanceof Drashti){
            Drashti objDr = (Drashti) obj;
            objDr.sound();
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        print(d1);
        Cat c1 = new Cat();
        print(c1);
        Drashti dr1 = new Drashti();
        print(dr1);
    }
}
