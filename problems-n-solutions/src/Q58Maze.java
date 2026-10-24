public class Q58Maze {
    static int countWays(int a, int b){
        if(a == 1 || b == 1){
            return 1;
        }
        return countWays(a - 1, b) + countWays(a, b - 1);
    }
    public static void main(String[] args){
        System.out.println(countWays(3,3));
    }
}

