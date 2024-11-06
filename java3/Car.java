package java3;

class Car{
    int seats;
    public Car(String brand,int seats){
         // Missing initialization of brand
    }
    public Car(int seats){
        this.seats=seats;// This constructor sets seats but not brand
    }
    public void displayCarDetails(){
        System.out.println("Car Has -"+this.seats);

    }
}