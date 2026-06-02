public class Q25LeetCodeFindInMountainArray {
        static int findPeak(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                int mid = start + (end - start) / 2;
                if(arr[mid] > arr[mid]+ 1){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        static int findInAsc(int[] m, int p, int t){
            int start = 0;
            int end = p;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(m[mid] == t){
                    return mid;
                }
                if(m[mid] > t){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return -1;
        }

        static int findInDesc(int[] m, int p, int t){
            int start = p;
            int end = m.length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(m[mid] == t){
                    return mid;
                }
                if(m[mid] > t){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return -1;
        }

        static int findInMountainArray(int target, int[] mountainArr) {
            int peak = findPeak(mountainArr);
            int first = findInAsc(mountainArr, peak, target);

            if(first > -1){
                return first;
            }
            int second = findInDesc(mountainArr, peak, target);
            if(second > -1){
                return second;
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9, 5, 0};
        int target = 8;

        int index = findInMountainArray(target, arr);
        System.out.println(index);
    }
}
