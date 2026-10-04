public class Q48StarPatter1UsingRecursion {
    static void printPattern(int n){
        if(n == 5){
            return;
        }
        printPattern(n+1);
        for(int i = 0; i < n; i++){
            System.out.print('*');
        }
        System.out.println("\n");
    }

    static void printPattern1(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print('*');
            printPattern1(r, c+1);
        }else{
            System.out.println();
            printPattern1(r-1, 0);
        }
    }

    static void printPattern2(int r, int c){
        if(r > 3){
            return;
        }
        if(c > r){
            System.out.println();
            printPattern2(r+1, 0);
        }else{
            System.out.print('*');   
            printPattern2(r, c+1);
        }
    }

    public static void main(String[] args){
        printPattern(1);
        printPattern1(4, 0);
        printPattern2(0, 0);
    }
}
