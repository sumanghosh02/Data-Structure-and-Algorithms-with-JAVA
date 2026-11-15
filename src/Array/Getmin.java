package Array;

public class Getmin {
    int getMin(int []arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]arr = {1,0,3,2,1};
        Getmin obj = new Getmin();
        System.out.println(obj.getMin(arr));
    }
}
