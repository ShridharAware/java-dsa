public class Q43Palindrome {
    static int sum = 0;
    static void rev(int n){
        if(n == 0) return;
        int digit = n % 10;
        sum = sum * 10 + digit;
        rev(n / 10);
    }

    static boolean isPalindrome(int n){
        rev(n);
        if(n == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(1112));
    }
}
