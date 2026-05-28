public class Q17LeetCodeRichestCustomerWealth {

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] customer: accounts){
            int sum = 0;
            for(int balance: customer){
                sum += balance;
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] customers = {{1,2,3}, {3,2,1}};

        int wealth = maximumWealth(customers);
        System.out.println(wealth);
    }
}
