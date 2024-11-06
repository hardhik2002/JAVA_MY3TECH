public class Adder {
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Adder a=new Adder();
        System.out.println(a.add(1,2));
        System.out.println(a.add(1.0,2.0));
    }
}
