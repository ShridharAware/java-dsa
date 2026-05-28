import java.util.Arrays;
import java.util.Scanner;

public class Q18BinarySearch {

    static  int[] binarySearch(int[] arr,int value){
        int[] result = {-1, -1, -1};

        int start = 0, end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int iteration = 0;
        while(start<=end){
            iteration++;
            if(arr[mid] == value){
                result[0] = arr[mid];
                result[1] = mid;
                result[2] = iteration;
                break;
            }
            if(arr[mid] < value){
                start = mid + 1;
                mid = start + (end - start) / 2;
                result[2] = iteration;
                continue;
            }else if(arr[mid] > value){
                end = mid - 1;
                mid = start + (end - start) / 2;
                result[2] = iteration;
                continue;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the element of the array : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter the element to search in the array : ");
        int toFind = sc.nextInt();

        int[] result = binarySearch(arr, toFind);

        if(result[0] == -1){
            System.out.println("Element not found, made " + result[2] + " iterations to search the given element");
        }else{
            System.out.println(result[0] + " found at index " + result[1] + " in " + result[2] + " iterations");
        }

        sc.close();
    }
}
