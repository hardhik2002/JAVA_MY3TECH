package collections;
import java.util.List;
import java.util.ArrayList;
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        System.out.println(li.isEmpty());
        li.add("Google");
        li.add("Microsoft");
        li.add("Apple");
        li.add("amazon");
        System.out.println(li.size());
        li.set(3,"wallmart");
        System.out.println(li);
    }
}
