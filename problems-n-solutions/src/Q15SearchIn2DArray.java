import java.util.Scanner;

public class Q15SearchIn2DArray {

    static void findIn2DArray(int[][] arr, int num){
        if(arr.length == 0){
            System.out.println("No data found");
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == num){
                    System.out.println(num + " found at index " + i + " - " + j);
                    return;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of cols of the matrix: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter element " + (i + 1) + "-"+ (j + 1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the elements to find in the array : ");
        int num = sc.nextInt();

        findIn2DArray(arr, num);

        sc.close();
    }
}
