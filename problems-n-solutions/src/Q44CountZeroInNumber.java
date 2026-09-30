public class Q44CountZeroInNumber {
    static int count = 0;
    static int countZero(int n){
        if(n < 9) return 0;
        if(n % 10 == 0) count++;
        countZero(n / 10);
        return count;
    }

    public static void main(String[] args){
        System.out.println(countZero(1000066));
    }
}
