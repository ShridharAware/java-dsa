public class Q40BasicRecursion {
    public static void main(String[] args){
        recursion(5);
    }
    public static void recursion(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        recursion(n - 1);
    }
}
