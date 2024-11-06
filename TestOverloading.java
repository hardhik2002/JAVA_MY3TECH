class Adder{
     int add(int a,int b){
        return a+b;
    }
     int add(int a,int b,int c){
        return a+b+c;
    }
}
public class TestOverloading extends Adder{
    public static void main(String[] args) {
        Adder obj=new Adder();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
