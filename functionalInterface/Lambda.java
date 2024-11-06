package functionalInterface;
@FunctionalInterface
interface Greeting{
    void sayMessage(String message);
}
public class Lambda {
    public static void main(String[] args) {
        Greeting birthGreeting=(msg)->System.out.println("Happy birthday: "+msg);
        birthGreeting.sayMessage("Hardhik");
    }
    
}
