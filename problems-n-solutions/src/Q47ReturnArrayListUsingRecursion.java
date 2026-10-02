import java.util.ArrayList;

public class Q47ReturnArrayListUsingRecursion {

    static ArrayList getIndex(int index, int[] arr, int num, ArrayList<Integer> indexes){
        if(index == arr.length){
            return indexes;
        }
        if(arr[index] == num){
            indexes.add(index);
        }
        return getIndex(index+1, arr, num, indexes);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4,5,4, 9};
        System.out.println(getIndex(0,arr, 4, new ArrayList<Integer>()));
    }
}
