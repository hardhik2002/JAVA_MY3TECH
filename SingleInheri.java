class Dog{
    void bark(){
        System.out.println("Dog barks.");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("Cat meows.");
    }
}

public class SingleInheri {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.bark();//Dog class inherited into the Cat class
        //This is single inheritance        
    }
}
