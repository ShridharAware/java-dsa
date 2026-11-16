public class Q85RoundingCashAtMarketStallInfosys1 {
    static int roundPrice(int price){
        int rem = price%5;
        if(rem == 0){
            return price;
        }
        if(rem == 1 || rem == 2){
            return (price/5)*5;
        }else{
            return (price/5)*5+rem+(5-rem);
        }
    }

    public static int calculateSavings(int M, int[] prices) {
        int indepSum = 0;
        for(int i: prices){
            indepSum += roundPrice(i);
        }
        int totalSum = 0;
        for(int i: prices){
            totalSum += i;
        }
        totalSum = roundPrice(totalSum);
        return indepSum - totalSum;
    }

    public static void main(String[] args){
        int[] prices = {11,12,13,18};
        System.out.println(calculateSavings(4, prices));
    }
}
