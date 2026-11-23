import java.util.ArrayList;
import java.util.HashMap;

public class Q91DPHowSum {
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    static ArrayList<Integer> howSum(int target, int[] nums) {
        if (map.containsKey(target)) {
            return map.get(target);
        }
        if (target == 0) {
            return new ArrayList<>();
        }
        if (target < 0 || nums.length == 0) {
            return null;
        }

        for (int i : nums) {
            int rem = target - i;
            ArrayList<Integer> temp = howSum(rem, nums);
            if (temp != null) {
                ArrayList<Integer> result = new ArrayList<>(temp);
                result.add(i);
                map.put(target, result);
                return result;
            }
        }

        map.put(target, null);
        return null;
    }

    public static void main(String[] args) {

        System.out.println(howSum(300, new int[]{7, 14}));
    }
}
