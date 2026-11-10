import java.util.HashMap;

public class Q81SubarraySumEqualsK {

    private static int subArraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            if(sum == k){
                count++;
                continue;
            }

            int last = i+1;

            while(last < nums.length && sum <= k){
                sum += nums[last];
                if(sum == k){
                    count++;
                }
                last++;
            }
        }
        return count;
    }

    private static int subArraySumOptimized(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixes = 0;
        int count = 0;

        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            prefixes += nums[i];
            int needed = prefixes - k;
            if(map.containsKey(needed)){
                count+= map.get(needed);
            }
            map.put(prefixes, map.getOrDefault(prefixes, 0)+1);
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 1};
        int k = 2;
//        System.out.println(subArraySum(nums, k));
        System.out.println(subArraySumOptimized(nums, k));
    }

}
