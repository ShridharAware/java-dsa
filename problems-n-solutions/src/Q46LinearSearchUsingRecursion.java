public class Q46LinearSearchUsingRecursion {

    static int foundNumber(int[] arr, int index, int num){
        if(index == arr.length - 1){
            return -1;
        }
        if(num == arr[index]){
            return index;
        }
        return foundNumber(arr, index + 1, num);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,12,342,4,5,6};
        System.out.println("Found number at index : " + foundNumber(arr, 0,11) );
    }
}
