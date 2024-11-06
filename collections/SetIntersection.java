package collections;
import java.util.*;
public class SetIntersection {
    public static void main(String[] args) {
        Set <Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set <Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        Set <Integer> intersectionSet=new HashSet<>(s1);
        intersectionSet.retainAll(s2);
        System.out.println(intersectionSet);
    }
}
