public class Q83MinSizeSubarraySum {

    private static int minSubArrayLen(int[] nums, int target) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            while(sum >= target){
                minLength = Math.min(minLength, i-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(nums, target));
    }

}
