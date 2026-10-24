import java.util.ArrayList;

public class Q61BacktrackingMazePathProblem {
    static ArrayList<String> findPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        maze[r][c] = false;

        ArrayList<String> list = new ArrayList<>();

        if(r > 0){
            list.addAll(findPaths(p+'U', maze, r-1, c));
        }
        if(c < maze[0].length-1){
            list.addAll(findPaths(p+'R', maze, r, c+1));
        }
        if(r < maze.length-1){
            list.addAll(findPaths(p+'D', maze, r+1, c));
        }
        if(c > 0){
            list.addAll(findPaths(p+'L', maze, r, c-1));
        }

        maze[r][c] = true;

        return list;
    }
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(findPaths("",maze, 0, 0));
    }
}
