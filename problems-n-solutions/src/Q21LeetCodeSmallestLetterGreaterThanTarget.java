public class Q21LeetCodeSmallestLetterGreaterThanTarget {
    static char smallestGreaterThanTarget(char[] arr, char target) {
        if(arr.length == 0) return 0;
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[end]) return 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }
        }
        return arr[start %  arr.length];
    }
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'z';

        System.out.println(smallestGreaterThanTarget(arr, target));
    }
}
