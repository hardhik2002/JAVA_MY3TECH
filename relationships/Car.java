package relationships;
public class Car {
    private String color;
    private int maxSpeed;
    public static void main(String[] args) {
        Car nano =new Car();
        nano.setColor("Red");
        nano.setMaxSpeed(329);
        nano.carInfo();
        Maserati quattroporte = new Maserati();
        quattroporte.MaseratiStartDemo();
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        }
    public void setColor(String color){
        this.color=color;
    }    
        public void carInfo(){
            System.out.println("car color: "+color+" max speed : "+maxSpeed);
        }
}
class Maserati extends Car{
    public void MaseratiStartDemo(){
        Engine MaseratiEngine = new Engine();
        MaseratiEngine.start();
        MaseratiEngine.stop();
    }
}
class Engine{
    public void start(){
        System.out.println("Started");
    }
    public void stop(){
        System.out.println("Stopped");
    }
}
