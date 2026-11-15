package Array;

public class MinSubArraySum {
    void minSubArraySum(int []arr, int i, int j) {
        int sum=0;
        int minValue = Integer.MAX_VALUE;
        for (int x = i; x <= j; x++) {
            sum = 0;
            for (int k=i; k <= x; k++) {
                System.out.print(arr[k]+" ");
                sum = sum+arr[k];
            }
            System.out.println();
            System.out.println("The Sum is: "+sum);

            if(sum < minValue){
                minValue =sum;
            }

        }

        System.out.println("The Minimum Sum is: "+minValue);

    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        MinSubArraySum obj = new MinSubArraySum();
        obj.minSubArraySum(arr,0,2);
    }
}
