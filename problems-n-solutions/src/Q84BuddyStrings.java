public class Q84BuddyStrings {
    static boolean buddyStrings(String s, String goal) {
        int j = 0;
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(j != 0){
                    j = i;
                }else{
                    k = i;
                }
            }
        }
        char[] temp = s.toCharArray();
        char tempchar = temp[j];
        temp[j] = temp[k];
        temp[k] = tempchar;
        String newS = new String(temp);
        return newS.equals(goal);
    }

    public static void main(String[] args){
        System.out.println(buddyStrings("ab", "ba"));
    }
}
