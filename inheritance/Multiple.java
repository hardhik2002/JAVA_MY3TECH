package inheritance;
interface Walkaable{
    void walk();
    default void fastWalk(){};//default method is not forced. 
}
interface Runnable{
    void run();
    void swim();
    
}
class Person implements Walkaable,Runnable{
    public void walk(){
        System.out.println("Person walks.");
        
    }
    public void run(){
        System.out.println("Person runs.");
    }
    // public void hi(){
    //     System.out.println("this is hi");
    // }
    public void swim(){
        System.out.println("swims");
    }
} 
public class Multiple {
    public static void main(String[] args){
        Runnable p=new Person();
        //p.walk();
        p.run();
    }
}
