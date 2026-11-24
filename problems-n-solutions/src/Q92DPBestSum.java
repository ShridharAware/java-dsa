import java.util.HashMap;
import java.util.ArrayList;

public class Q92DPBestSum {

    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    static ArrayList<Integer> bestSum(int target, int[] nums) {

        if (map.containsKey(target)) {
            return map.get(target);
        }

        if (target == 0) {
            return new ArrayList<>();
        }

        if (target < 0) {
            return null;
        }

        ArrayList<Integer> shortestCombination = null;

        for (int i : nums) {

            ArrayList<Integer> res = bestSum(target - i, nums);

            if (res != null) {

                ArrayList<Integer> combination = new ArrayList<>(res);
                combination.add(i);

                if (shortestCombination == null ||
                        combination.size() < shortestCombination.size()) {

                    shortestCombination = combination;
                }
            }
        }

        map.put(target, shortestCombination);

        return shortestCombination;
    }

    public static void main(String[] args) {
        System.out.println(bestSum(7, new int[]{5, 3, 4, 7}));
    }
}
