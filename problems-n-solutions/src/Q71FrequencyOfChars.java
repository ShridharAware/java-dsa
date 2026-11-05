import java.util.HashMap;

public class Q71FrequencyOfChars {
    public static void main(String[] args){
        String input = "programming";
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            if(count.get(input.charAt(i)) == null){
                count.put(input.charAt(i), 1);
            }else{
                count.put(input.charAt(i), count.get(input.charAt(i)) + 1);
            }
        }
        System.out.print(count);
    }
}
