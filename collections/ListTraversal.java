package collections;
import java.util.*;
public class ListTraversal {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Blue");
        for(String color: colors){
            System.out.println(color);
        }
    }
}
