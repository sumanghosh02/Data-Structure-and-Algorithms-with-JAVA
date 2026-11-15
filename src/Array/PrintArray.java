package Array;

public class PrintArray {
    void printArray(int []arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        PrintArray obj = new PrintArray();
        obj.printArray(arr);
    }
}
