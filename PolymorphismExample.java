class Animal{    
        void sound(){
        System.out.println("This animal can eat.");
        }   
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("This dog barks.");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("The cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal=new Dog();
        myAnimal.sound();
        myAnimal=new Cat();
        myAnimal.sound();        
    }
}
