package collections;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",3);
        map.put("Banana",4);
        map.put("orange",5);
        System.out.println("Value for Apple: "+map.get("Apple"));
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());

        }
    }
}
