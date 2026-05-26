import java.util.Scanner;

public class Q10MaxItemInArray {
    static int maxNumOfArray(int[] arr){
        if(arr.length == 0) return 0;
        int max = 0;
        for(int num: arr){
            if(num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + 1 + " element of the array : ");
            arr[i] = sc.nextInt();
        }

        int maxNum = maxNumOfArray(arr);
        System.out.println("Max number of an array is " + maxNum);

        sc.close();
    }
}
