public class Array {
    public static void main(String[] args) {
        //int a[]=new int[5];
        int[] a={1,2,3,4,5}; 
             
        int a_[]=new int[5];
         a[0]=10;
         a[1]=20;
         a[4]=30;
         a[5]=40;

        
        for(int i=0;i<a_.length;i++){        
        System.out.println(a_[i]);}
        int b[]={1,2,3,4};
        for(int j=0;j<3;j++){
            System.out.println(b[j]);
        }
        //for-each loop 
        for(int i:b){
            System.out.println(i);
        }
    }
}
