public class Q24LeetCodeMountainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                return mid;
            }else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9, 5, 0};
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
    }
}
