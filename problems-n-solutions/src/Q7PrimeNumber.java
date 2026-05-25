import java.util.Scanner;

public class Q7PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is prime or not :");
        int num = sc.nextInt();

        boolean prime = isPrime(num);
        if(prime){
            System.out.println("Prime number");
        }else {
            System.out.println("Not Prime number");
        }
        sc.close();
    }

    static boolean isPrime(int n){
        if (n <=1){
            return false;
        }
        int val = 2;
        while(val <= n / 2){
            if (n%val == 0){
                return false;
            }
            val++;
        }
        return true;
    }
}
