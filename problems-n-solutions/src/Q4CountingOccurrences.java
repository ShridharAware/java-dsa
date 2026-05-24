import java.util.Scanner;

public class Q4CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to store in an array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter " + (i + 1) + " number : ");
            array[i] = sc.nextInt();
        }

        System.out.print("For which number you want to count the occurences :");
        int num = sc.nextInt();
        int count = 0;

        for(int i : array){
            if(i == num) count++;
        }

        System.out.println(num + " occurences count is " + count);
        sc.close();
    }
}
