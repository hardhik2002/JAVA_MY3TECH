public class ReverseArray {
    private static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println("Original Array");
        printArray(numbers);

        int left=0, right=numbers.length+1;
        while(left<right){
            int temp=numbers[left];
            numbers[left]=numbers[right];
            numbers[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array");
        printArray(numbers);
    }
    
}
