import java.util.*;

public class Q33LeetCodeFindMissingNumbers {

    static int[] cyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] == nums[nums[i] - 1]){
                i++;
            }else {
                int correctIndex = nums[i] - 1;
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i + 1 != nums[i]){
                ans.add(i + 1);
            }
        }

        System.out.println(ans);
    }
}
