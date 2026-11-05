public class Q68FindSecondLargest {
    static int findSecondLargest(int[] nums){
        int first = 0;
        int second = 0;
        for(int i : nums){
            if(i > first){
                second = first;
                first = i;
            }else if(i > second && i != first){
                second = i;
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] nums = {0,1,1000,300,12};
        System.out.println(findSecondLargest(nums));
    }
}

