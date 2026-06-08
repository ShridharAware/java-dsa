import java.util.Arrays;

public class Q28BubbleSort {

    static int[] bubbleSort(int[] arr) {
        if(arr.length == 0) return new int[0];

        boolean isSorted = true;

        for(int i = 0; i < arr.length; i++){
              for(int j = 0; j < arr.length - 1; j++){
                  if(arr[j] > arr[j + 1]){
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                      isSorted = false;
                  }
              }
              if(isSorted){
                  return arr;
              }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
