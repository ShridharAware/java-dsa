import java.util.Arrays;

public class Q31CyclicSort {

    static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            int index = i + 1;
            if(arr[i] == index){
                i++;
            }else{
                int correctIndex = arr[i] - 1;
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {2,6,4,3,5,1};

        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
}
