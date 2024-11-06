package exception;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try{
            int result=10/0;
             }
        catch (ArithmeticException e){
            System.out.println("caught an exception: "+e.getMessage());
        }     
        finally{
            System.out.println("This final block always exicutes.");
        }
    }
}
