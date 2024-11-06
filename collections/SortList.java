package collections;
import java.util.*;
public class SortList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);

    }
}
