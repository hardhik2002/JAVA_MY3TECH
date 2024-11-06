public class B {
   
    public void modifyX(int newValue){
        System.out.println(A.x);
        A obj=new A();
        obj.x=newValue;
        
    }
}
