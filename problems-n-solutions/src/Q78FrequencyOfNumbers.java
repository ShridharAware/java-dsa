import java.util.HashSet;

public class Q78FrequencyOfNumbers {

    static boolean isRepeated(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1};
        System.out.println(isRepeated(nums));
    }
}
