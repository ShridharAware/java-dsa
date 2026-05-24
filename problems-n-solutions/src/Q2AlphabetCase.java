import java.util.Scanner;

public class Q2AlphabetCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The character " + ch + " is a letter");
        }else{
            System.out.println("The character " + ch + " is not a letter");
        }

        sc.close();
    }
}
