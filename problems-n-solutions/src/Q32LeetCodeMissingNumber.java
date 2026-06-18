public class Q32LeetCodeMissingNumber {
        static int missingNumber(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (i == nums[i] || nums[i] == nums.length) {
                    i++;
                } else {
                    int correctIndex = nums[i];
                    int temp = nums[correctIndex];
                    nums[correctIndex] = nums[i];
                    nums[i] = temp;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (j != nums[j]) {
                    return j;
                }
            }

            return nums.length;
        }
        public static void main(String[] args){
            int[] nums = {3,0,1};
            System.out.println("Missing Number is " + missingNumber(nums));
        }
}
