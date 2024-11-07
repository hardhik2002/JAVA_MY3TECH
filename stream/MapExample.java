package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Double> pricesInUSD=Arrays.asList(10.0,15.5,20.0,25.5);
        double conversionRate=0.85;
        List<Double> pricesInEUR=pricesInUSD.stream()
        .map(price -> price * conversionRate)
        .collect(Collectors.toList());
        System.out.println(pricesInEUR);
    }
}
