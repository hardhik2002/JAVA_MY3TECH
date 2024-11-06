package collections;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List <String> list=new ArrayList <String> ();
        list.add("Java");
        list.add("python");
        list.add("Java");
        System.out.println("All elements in the list");
        for(String name: list){
            System.out.println(name);
        }

    }
}
