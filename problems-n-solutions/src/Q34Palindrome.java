public class Q34Palindrome {

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }

        char[] strArray = str.toLowerCase().toCharArray();

        int i = 0;
        int n = str.length() - 1;
        while(i < n){
            if(strArray[i] != strArray[n]){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "abaa";

        System.out.println(isPalindrome(str));
    }
}
