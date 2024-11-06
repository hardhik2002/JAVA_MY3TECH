package collections;
import java.util.*;
public class TestJavaCollection2{
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Kavya");
        al.add("Hardhik");
        al.add("Venkat");
        al.add("Pavan");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
