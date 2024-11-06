public class Overloading {    
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Overloading obj=new Overloading();
        int r1=obj.add(2,3,4);
        int r2=obj.add(1,3);
        System.out.println(r1+" "+r2);

    }    
}
