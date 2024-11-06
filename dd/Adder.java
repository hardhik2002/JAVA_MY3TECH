class Add{
    public int add(int a,int b){
        return a+b;
    }
}
public class Adder{
    void dd(){
        System.out.println("This is dd");
    }
    public static void main(String[] args) {
        Add adder=new Add();
        System.out.println(adder.add(1,2));
        Adder dd=new Adder();
        dd.dd();
    }
}
