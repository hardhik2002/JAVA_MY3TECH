import java.util.ArrayList;
import java.util.List;

public class Error {
    public static void main(String[] args) {
        List<int[]> memoryHog = new ArrayList<>();

        
        while (true) {
            memoryHog.add(new int[10_000_000]);  
        }
    }
}
    