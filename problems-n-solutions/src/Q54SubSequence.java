public class Q54SubSequence {

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }

        subSeq(p+up.charAt(0), up.substring(1));
        subSeq(p, up.substring(1));

    }

    public static void main(String[] args){
        subSeq("", "abc");
    }
}
