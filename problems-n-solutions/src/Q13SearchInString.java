import java.util.Scanner;

public class Q13SearchInString {

    static int findChar(String str, char ch){
        if(str.isEmpty()) return -1;
        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("enter character that you want to search in the string : ");
        char ch = sc.next().charAt(0);

        int result = findChar(str, ch);

        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index " + result);
        }

        sc.close();
    }
}
