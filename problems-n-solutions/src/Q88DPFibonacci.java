import java.util.HashMap;

public class Q88DPFibonacci {

    static HashMap<Integer, Long> dataMap = new HashMap<>();

    static long fib(int n){
        if(n <= 2){
            return 1;
        }
        if(dataMap.containsKey(n)){
            return dataMap.get(n);
        }

        long fibValue = fib(n-1) + fib(n-2);
        dataMap.put(n, fibValue);

        return fibValue;
    }

    public static void main(String[] args){
        System.out.println(fib(10));
    }
}
