import java.util.Arrays;
import java.util.Scanner;

public class Q11ReverseAnArray {
    static void reverseArray(int[] arr) {
//        System.out.print("Reverse Array " + "[");
//        for(int i = arr.length - 1; i >= 0; i--){
//            if(i == 0){
//                System.out.print(arr[i]);
//            }else{
//                System.out.print(arr[i] + ", ");
//            }
//        }
//        System.out.print("]");
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array : " + Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter the " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Before reversing : " + Arrays.toString(arr));

        reverseArray(arr);

        sc.close();
    }
}
