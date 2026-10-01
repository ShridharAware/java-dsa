public class Q45CheckIfArrayIsSortedorNot {

    static boolean isSorted(int[] arr, int index){
        if(index < arr.length - 1){
            if(arr[index] > arr[index+1]) {
                return false;
            }else{
                return isSorted(arr, index+1);
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,8,5,6};
        System.out.println(isSorted(arr, 0));
    }
}
