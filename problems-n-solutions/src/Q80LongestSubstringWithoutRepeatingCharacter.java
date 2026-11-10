import java.util.HashSet;

public class Q80LongestSubstringWithoutRepeatingCharacter {

    static int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int longestSubString = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            longestSubString = Math.max(longestSubString, i-left+1);
        }
        return longestSubString;
    }

    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(longestSubstring(s));
    }
}
