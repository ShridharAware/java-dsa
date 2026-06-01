public class Q22LeetCodeFirstAndLastPositionOfElementInSortedArray {

    static int findFirstIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                first = mid;
                end = mid - 1;
            }else if(nums[mid] > target) {
                end =  mid - 1;
            }else{
                start =  mid + 1;
            }
        }
        return first;
    }



    static int findLastIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                last = mid;
                start = mid + 1;
            }else if(nums[mid] > target) {
                end =  mid - 1;
            }else{
                start =  mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5, 8, 8, 8, 8, 18};
        int target = 8;
        int first = findFirstIndex(nums, target);
        int last = findLastIndex(nums, target);
        System.out.println(first + " " + last);
    }
}
