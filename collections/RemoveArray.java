package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemoveArray {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        Iterator<Integer> numbersIterator=numbers.iterator();
        while (numbersIterator.hasNext()){
            Integer num=numbersIterator.next();
            if (num%2 !=0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
        
        

    }
}
