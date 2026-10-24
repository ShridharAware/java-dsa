public class Q59MazeWithPath {

    static void mazeWithPath(String p, int r, int c){
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 0) {
            mazeWithPath(p + 'D', r - 1, c);
        }
        if(c > 0) {
            mazeWithPath(p + 'R', r, c - 1);
        }
    }

    public static void main(String[] args){
        mazeWithPath("", 3, 3);
    }
}
