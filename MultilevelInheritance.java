class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog can bark.");
    }
}
class Puppy extends Dog {
    void weep(){
        System.out.println("The puppy can weep");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

    }
}