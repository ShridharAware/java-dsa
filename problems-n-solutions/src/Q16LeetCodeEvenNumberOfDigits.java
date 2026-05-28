import java.util.Scanner;

public class Q16LeetCodeEvenNumberOfDigits {

    static int findEvenDigits(int[] arr){
        if(arr.length==0) return -1;

        int count = 0;

        for(int i : arr){
            if(i == 0) continue;
            if(i < 0) i *= -1;
            int num = i;
            int digit = 0;
            while(num > 0){
                digit++;
                num /= 10;
            }

            if(digit % 2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = findEvenDigits(arr);

        if(result == -1){
            System.out.println("Empty array");
        }else {
            System.out.println("Number of even digits in given array : " + result);
        }

        sc.close();
    }
}
