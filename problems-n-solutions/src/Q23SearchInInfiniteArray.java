public class Q23SearchInInfiniteArray {

    static int findTarget(int[] nums, int target) {
        int start = 0;
        int end = 1;

        // Find range
        while (end < nums.length && target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            if (end >= nums.length) {
                end = nums.length - 1;
            }

            start = newStart;
        }

        // Binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target = 22;
        int index = findTarget(nums, target);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }
}
