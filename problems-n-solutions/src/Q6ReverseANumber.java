import java.util.Scanner;

public class Q6ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

         int revNum = 0;
         while (n > 0){
             int rem =  n % 10;
             if (rem == 0){
                 revNum = rem;
             } else {
                 revNum = revNum * 10 + rem;
             }
             n /= 10;
         }
        System.out.println("The reverse number is " + revNum);
    }
}
