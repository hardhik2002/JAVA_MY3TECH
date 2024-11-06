class A{
    int a(){
        int x=10;
        return x;
    }
}
class B extends A{
    int b(){
        int y=20;
        return y;
    }
}
class C extends A{
    int c(){
        int z=30;
        return z;
    }
}
public class MultilevelInheri {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        System.out.println(a.a());
        System.out.println(b.b());
        System.out.println(b.a());
        System.out.println(c.c());
        System.out.println(c.a());        
    }
}
