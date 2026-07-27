public class Q37BinarySearchUsingRecursion {

    static int recursion(int start, int end, int[] arr, int num){
        int index = 0;
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if(arr[mid] == num){
            return mid;
        }
        if(num > arr[mid]){
            return recursion(mid + 1, end, arr, num);
        }else{
            return recursion(start, mid - 1, arr, num);
        }
    }

    static int findIndex(int[] arr, int num){
        if(arr.length == 0) return -1;
        return recursion(0, arr.length - 1, arr, num);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 8, 22, 27, 29, 100, 105};

        System.out.println(findIndex(arr, 27));   // 5  
        System.out.println(findIndex(arr, 22));   // 4
        System.out.println(findIndex(arr, 100));  // 7
        System.out.println(findIndex(arr, 10));   // -1
    }
}
