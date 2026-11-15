package Array;

public class SubArraySum {
    void subArraySum(int []arr, int i, int j) {

        for (int x = i; x <= j; x++) {
            int sum = 0;
            for (int k=i; k <= x; k++) {
                System.out.print(arr[k]+" ");
                sum = sum+arr[k];

            }
            System.out.println();
            System.out.println("The Sum is: "+sum);

        }


    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        SubArraySum obj = new SubArraySum();
        obj.subArraySum(arr,0,2);
    }

}
