package collections;
import java.util.*;
class TestJavaCollection1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Kavaya");
        list.add("Hardhik");
        list.add("Venkat");
        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
}
    }
    
