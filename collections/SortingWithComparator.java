package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortingWithComparator {
    public static void main(String[] args) {        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);        
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; 
            }
        });       
        System.out.println("Sorted list in descending order: " + numbers);
    }
}
