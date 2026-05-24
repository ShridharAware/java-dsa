import java.util.Scanner;

public class Q5NumOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here : ");
        int num = sc.nextInt();
        System.out.print("Enter digit whose occurrence you want to count : ");
        int n =  sc.nextInt();

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == n){
                count++;
            }
            num /= 10;
        }
        System.out.println("Occurences of digit " + n + "  count is " + count);
    }
}
