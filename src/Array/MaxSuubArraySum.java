package Array;

public class MaxSuubArraySum {
    void maxSubArraySum(int []arr, int i, int j) {
        int sum=0;
        int maxValue = Integer.MIN_VALUE;
        for (int x = i; x <= j; x++) {
            sum = 0;
            for (int k=i; k <= x; k++) {
                System.out.print(arr[k]+" ");
                sum = sum+arr[k];
            }
            System.out.println();
            System.out.println("The Sum is: "+sum);

            if(sum > maxValue){
                maxValue =sum;
            }
        }

        System.out.println("The Maximum Sum is: "+maxValue);


    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        MaxSuubArraySum obj = new MaxSuubArraySum();
        obj.maxSubArraySum(arr,0,2);
    }
}
