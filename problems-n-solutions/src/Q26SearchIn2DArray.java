import java.util.Arrays;

public class Q26SearchIn2DArray {

    static int[] searchElement(int[][] arr, int target){
        int[] res = {-1, -1};

        if(arr.length == 0){
            return res;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[][] arr = {{1, 5, 6}, {7, 77, 21}, {32, 211, 45}};
        int target = 211;

        int[] res = searchElement(arr, target);

        if(res[0] == -1){
            System.out.println("Empty array");
        }else{
            System.out.println("Found element at index " + Arrays.toString(res));
        }
    }
}
