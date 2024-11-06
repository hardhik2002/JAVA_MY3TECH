package inheritance;
class Animal{
    void sound(){
        System.out.println("Animal make sounds");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("puppy weeps.");
    }
}
public class Multilevel {
    public static void main(String[] args) {
     Puppy puppy=new Puppy();
     puppy.sound();
     puppy.bark();
     puppy.weep();   
    }
}
