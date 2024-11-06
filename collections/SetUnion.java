package collections;
import java.util.Set;
import java.util.HashSet;
public class SetUnion {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        Set<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        Set<Integer> unionSet = new HashSet<>(s);
        unionSet.addAll(s2);
        System.out.println("Union of set1 and set2: " + unionSet);
    }
}
