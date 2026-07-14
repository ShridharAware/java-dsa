public class Q35Patterns {

//    Pattern 1
//    * * * *
//    * * * *
//    * * * *
//    * * * *
    static void pattern1(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 2
//    *
//    * *
//    * * *
//    * * * *
    static void pattern2(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 3
//    * * * *
//    * * *
//    * *
//    *
    static void pattern3(){
        for(int i = 0; i < 4; i++){
            for(int j = 4; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 4
//    1
//    1 2
//    1 2 3
//    1 2 3 4

    static void pattern4(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

//    Pattern 5
//            *
//          * *
//        * * *
//      * * * *
    static void pattern5(){
        for(int i = 4; i > 0; i--){
            for(int j = 1; j <= 4; j++){
                if(j >= i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
    }
}
