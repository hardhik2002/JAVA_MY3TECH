package functionalInterface;
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car started");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();
        v1.stop();
    }
}
