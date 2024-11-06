class Animal{
    void sound(){
        System.out.println("This animal makes sound");
    }
    void sound(String animalType){
        System.out.println("this "+animalType+" makes a sound.");
    }
    void sound(int times){
        System.out.println("This animal makes sound "+times+" times.");
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.sound();
        animal.sound("Dog");
        animal.sound(3);
    }
}
