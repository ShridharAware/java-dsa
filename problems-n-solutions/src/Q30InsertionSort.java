import java.util.Arrays;

public class Q30InsertionSort {

    static int[] insertionSort(int[] arr){
        if(arr.length == 0) return new int[]{};

        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3, 4, 2, 9, 5, 10};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
