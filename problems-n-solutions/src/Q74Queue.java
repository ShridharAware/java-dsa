class Queue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Queue(){
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        data = new int[size];
    }

    private boolean isEmpty(){
        return end == 0;
    }

    private boolean isFull(){
        return end == data.length;
    }

    public boolean insert(int value){
        if(isFull()){
            System.out.print("Queue is full!!");
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.print("Queue is empty!!");
            return 0;
        }
        int remove = data[0];

        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }

 }

public class Q74Queue {
    public static void main(String[] args){
        Queue que = new Queue(5);

        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);

        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
    }
}
