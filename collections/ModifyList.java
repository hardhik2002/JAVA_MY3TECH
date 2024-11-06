package collections;
import java.util.*;
public class ModifyList {
    public static void main(String[] args) {
        List <Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.set(1,10);
        System.out.println(num);
    }
}
