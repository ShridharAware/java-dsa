public class Q8ThreeDigitArmstrongNumbers {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++){
            if(isArmstrong(i)){
                System.out.println("Armstrong number : " + i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int on = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if(on == sum){
            return true;
        }
        return false;
    }
}
