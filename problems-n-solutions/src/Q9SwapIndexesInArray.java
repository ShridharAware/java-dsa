import java.util.Arrays;
import java.util.Scanner;

public class Q9SwapIndexesInArray {
    static void swapIndexes(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("After swapping : " + Arrays.toString(arr));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter two indexes to swap");
        System.out.print("Enter index 1 : ");
        int index1 = sc.nextInt();
        System.out.print("Enter index 2 : ");
        int index2 = sc.nextInt();

        System.out.println("Before swap : " + Arrays.toString(arr));

        swapIndexes(arr, index1, index2);

        sc.close();
    }
}
