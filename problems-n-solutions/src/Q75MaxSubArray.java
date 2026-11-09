public class Q75MaxSubArray {
    static int maxSumSubArray(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSumSubArray(nums));
    }
}
