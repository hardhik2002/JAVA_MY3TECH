public class Calculator{
    public void doSomething(){
        int i=10;
        {
            int j=20;
            System.out.println(i+" "+j);
        }        
    }
    public static void main(String[] args){
        Calculator res=new Calculator();
        res.doSomething();
    }
}