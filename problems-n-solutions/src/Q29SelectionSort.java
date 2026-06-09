import java.util.Arrays;

public class Q29SelectionSort{

    static int findMaxIndex(int[] arr, int end){
        int max = 0;
        for(int i = 0; i <= end; i++){
            if(arr[i] > arr[max]) max = i;
        }
        return max;
    }

    static int[] selectionSort(int[] arr){
        if(arr.length == 0) return new int[] {};
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = findMaxIndex(arr, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,4,6,2,8,9};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}