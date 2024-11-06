package collections;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list=new ArrayList <>();
        list.add("Java");
        list.add("Kavya");
        list.add("Java");//duplicate
        Set<String> uniqueElement=new HashSet<String>(list);
        list.clear();
        list.addAll(uniqueElement);
        System.out.println(list);
    }
}
