public class Q39NoDuplicateNumber {

    static int uniqueNum(int[] nums){
        int unique = 0;
        for(int n: nums){
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 5, 5, 7, 7, 6};
        System.out.println(uniqueNum(nums));
    }
}
