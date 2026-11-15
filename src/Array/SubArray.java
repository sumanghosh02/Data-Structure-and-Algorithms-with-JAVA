package Array;

public class SubArray {
    void printSubArray(int []arr, int i, int j){
        for (int x=i; x<=j; x++){
            for(int k=i; k<=x; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        SubArray obj = new SubArray();
        obj.printSubArray(arr,0,2);
    }
}
