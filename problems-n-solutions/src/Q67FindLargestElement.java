public class Q67FindLargestElement {
    static int findLargest(int[] nums){
        int smax = 0;
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            if(nums[s] > smax){
                smax = nums[s];
                s++;
            }else if(nums[e] > smax){
                smax = nums[e];
                e--;
            }else{
                s++;
                e--;
            }
        }
        return smax;
    }
    public static void main(String[] args){
        int[] nums = {0,1,1000,3,12};
        System.out.println(findLargest(nums));
    }
}
