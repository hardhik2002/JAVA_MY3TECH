package collections;
import java.util.*;
public class ListToSet{
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("A");
        Set<String> set=new HashSet<>(l);
        System.out.println("list after convertion to list: "+set);
    }
}
