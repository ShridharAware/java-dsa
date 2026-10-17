public class Q57PhonePad  {

    static void dialNum(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ',');
            return;
        }
        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            dialNum(p + ch, up.substring(1));
        }
    }

    public static void main(String[] args){
        dialNum("", "12");
    }
}
