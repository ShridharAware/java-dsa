import java.util.Scanner;

public class Q3FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a index which you want to get fibonacci value for : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int index = 2;
        while(index <= n){
            int temp = b;
            b += a;
            a = temp;
            index++;
        }

        System.out.println("The fibonacci value is " + b);
    }
}
