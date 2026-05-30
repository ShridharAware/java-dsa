import java.util.Arrays;
import java.util.Scanner;

public class Q20FloorOfANumber {

    static int getFloorNumber(int[] arr, int target){
        if(arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) return -1;
        while(start <= end){
            int mid = start  + (end - start) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element of array : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        int floorNumber = getFloorNumber(arr, target);
        if(floorNumber == 0 ) System.out.println("Empty array");
        else System.out.println("Floor number is " + floorNumber);

        sc.close();
    }
}
