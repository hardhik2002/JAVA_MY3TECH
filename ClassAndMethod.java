public class ClassAndMethod{


    public int calc(int n1,int n2){
        int r=n1+n2;
        return r;

    }
    public static void main(String[] args) {
        ClassAndMethod calc_=new ClassAndMethod();
        int res=calc_.calc(1,2);
        System.out.println(res);

    }
}