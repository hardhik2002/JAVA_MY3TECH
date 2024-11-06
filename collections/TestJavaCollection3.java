package collections;
import java.util.*;
public class TestJavaCollection3 {
    public static void main(String[] args) {
        Vector<Object> v=new Vector<Object>();
        v.add("Kavya");
        v.add("Hardhik");
        Iterator<Object> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }  

}
