package java1.java2;
public class Scopping {
     public  int  doSomething(){
        
       
        int x = 12;
        
        { int q = 96;
           
          }
       return x;
       
        
        
    }
    public static void main(String[] args) {
        Scopping obj=new Scopping();
        obj.doSomething();
        System.out.println(obj.doSomething());
        

    }
}
