import java.util.HashMap;

public class Q89DPGridTraveller {

    static HashMap<String, Long> map = new HashMap<>();

    static long gridTraveller(int n, int m){
        if(n == 0 || m == 0) return 0;
        if(n == 1 && m == 1) return 1;
        String key = n+","+m;
        if(map.containsKey(key)) return map.get(key);

        long val = gridTraveller(n-1, m) + gridTraveller(n, m-1);
        map.put(key, val);
        return val;
    }

    public static void main(String[] args){
        System.out.println(gridTraveller(18, 18));
    }
}
