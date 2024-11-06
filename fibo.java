import java.util.Scanner;
public class fibo {
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int first_term=0,second_term=1;
        for (int i=1;i<=n;++i){
            System.out.print(first_term+" ");
            int next_term=first_term+second_term;
            first_term=second_term;
            second_term=next_term;


        }
        scanner.close();
    }
}
