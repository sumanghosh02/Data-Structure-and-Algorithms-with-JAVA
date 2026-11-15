package Array;

public class Search {
    boolean search(int []arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key Found at Location: "+i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {1,0,3,2,1,};
        Search obj = new Search();
        boolean result = obj.search(arr,1);
        System.out.println("Key Found: " + result);
    }
}
