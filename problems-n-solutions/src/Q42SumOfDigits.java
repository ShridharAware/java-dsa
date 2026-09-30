public class Q42SumOfDigits {
    public static void main(String[] args){
        System.out.println(sumOfDigits(1001));
    }

    static int sumOfDigits(int n){
        if(n == 0) return 0;
        int num = n / 10;
        int digit = n % 10;
        return digit + sumOfDigits(num);
    }
}
