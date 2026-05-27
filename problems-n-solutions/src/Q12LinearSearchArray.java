import java.util.Scanner;

public class Q12LinearSearchArray {

    static int linearSearch(int[] arr, int key) {
        if(arr == null || arr.length == 0) return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[]  arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();

        int result = linearSearch(arr, search);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + result);
        }

        sc.close();
    }
}
