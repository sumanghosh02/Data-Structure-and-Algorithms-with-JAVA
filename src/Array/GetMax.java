package Array;

public class GetMax {
    int getMax(int []arr){
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1};
        GetMax obj = new GetMax();
        System.out.println(obj.getMax(arr));
    }
}
