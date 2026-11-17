import java.util.ArrayList;

public class Q86SharingPrintJobsInfosys2 {

    static int findMinimum(ArrayList<int[]> list, int index, int p1, int p2){
        if(index == list.size()){
            return Math.max(p1, p2);
        }
        int op1 = findMinimum(list, index+1, p1+list.get(index)[0], p2);
        int op2 = findMinimum(list, index+1, p1, p2+list.get(index)[1]);
        return Math.min(op1, op2);
    }

    public static int minimumPrintTime(int M, int[][] jobs) {
        int p1 = 0;
        int p2 = 0;

        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i < M; i++){
            if(jobs[i][2] == 1){
                p1+=jobs[i][0];
            }else if(jobs[i][2] == 2){
                p2+=jobs[i][1];
            }else{
                list.add(jobs[i]);
            }
        }
        return findMinimum(list, 0, p1, p2);
    }

    public static void main(String[] args) {

        int[][] jobs = {
                {2, 2, 0},
                {4, 2, 0},
                {2, 1, 0}
        };

        System.out.println(minimumPrintTime(3, jobs));

    }

}
