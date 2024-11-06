class class1{
    public void stri(){
        System.out.println("From class 1");
    }
}
class class2 extends class1{
    public void stri_(){
        System.out.println("From class 2");
    }
}

public class ConnectingClasses extends class2
{
    public static void main(String[] args) {
        class1 obj =new class1();
        class2 obj_ =new class2();
        obj.stri();
        obj_.stri_();
    }
}
