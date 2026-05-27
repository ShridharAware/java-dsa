import java.util.Scanner;

public class Q14MinItemInArray {

    static int findMin(int[] arr){
        if(arr.length == 0) return -1;
        int min = arr[0];
        for(int i: arr){
            if(i < min) min = i;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr);

        if(min == -1){
            System.out.println("Empty array");
        }else {
            System.out.println("Minimum element is " + min);
        }

        sc.close();
    }
}
