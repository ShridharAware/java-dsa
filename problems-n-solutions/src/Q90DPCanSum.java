import java.util.HashMap;

public class Q90DPCanSum {
    static HashMap<Integer, Boolean> map = new HashMap<>();
    static boolean canSum(int target, int[] nums){
        if(map.containsKey(target)) return map.get(target);
        if(target == 0) return true;
        if(target < 0) return false;
        for(int i: nums){
            if(canSum(target - i, nums)) {
                map.put(target, true);
                return true;
            }
        }

        map.put(target, false);
        return false;
    }

    public static void main(String[] args){
        System.out.println(canSum(8,new int[]{2,3,5}));
    }
}
