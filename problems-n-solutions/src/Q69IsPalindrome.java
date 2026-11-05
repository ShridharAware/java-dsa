public class Q69IsPalindrome {

    static boolean isPalindrome(String in){
        int s = 0;
        int e = in.length() - 1;

        while(s < e){
            if(in.charAt(s) == in.charAt(e)){
                s++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "madamm";
        boolean b = isPalindrome(s);
        System.out.print(b ? "True" : "False");
    }
}
