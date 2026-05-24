import java.util.Scanner;

public class Q1LargestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = scanner.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = scanner.nextInt();

        System.out.print("Largest number among above 3 numbers is " + Math.max(a, Math.max(b,c)) + ".");

        scanner.close();
    }
}
