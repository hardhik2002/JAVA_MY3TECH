import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner myob=new Scanner(System.in);
        int number=myob.nextInt(); 
        int i,fact=1;
        
        for (i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
