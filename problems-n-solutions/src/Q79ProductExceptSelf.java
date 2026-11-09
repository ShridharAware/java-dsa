import java.util.Arrays;

public class Q79ProductExceptSelf {

    static int[] products(int[] nums){
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                product *= nums[j];
            }
            res[i] = product;
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(products(nums)));
    }
}
