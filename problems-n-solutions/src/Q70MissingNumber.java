public class Q70MissingNumber {

    static int missingNumber(int[] nums){
        int first = 0;
        int second = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[second] - nums[first] != 1){
                return nums[first] + 1;
            }
            first++;
            second++;
        }
        return 0;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,5,6};
        System.out.print(missingNumber(nums));
    }
}
