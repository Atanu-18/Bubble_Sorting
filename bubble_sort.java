import java.util.Arrays;

public class bubble_sort{
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void bubble(int[] arr){
        boolean swapeed;
        // run the steps for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapeed = false;
            //for each step , max item will come in the end index
            for (int j = 1; j < arr.length-i; j++) {          //j <= arr.length-i-1
                // swap if item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapeed = true;
                }
            }
            // if you didn't swap for a particular value of i,i.e array is sorted and program is stopped here
            if (!swapeed) {
                break;
            }
        }
    }
}