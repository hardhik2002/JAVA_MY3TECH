public class EvenOdd{
    public static void findEvenOdd(int num){
        if (num%2==0){
            System.out.println("This is even");
        }
        else{
            System.out.println("This is odd");
        }
    }
    public static void main(String[] args){
            EvenOdd obj=new EvenOdd();
            obj.findEvenOdd(2);
    }
}