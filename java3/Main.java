package java3;

public class Main {
    public static void main(String[] args) {
        Bike b=new Bike("Mountain Bike", "Mountain");
        //One that takes both a brand and a type.
        //Another that takes only a type.
        b.displayBikeDetails();

        Car c=new Car("Hyndai",5);
        c.displayCarDetails();
        System.out.println(c.hashCode());
        System.out.println(b.hashCode());

        System.out.println(c.equals(b));
            
       
    }
}
