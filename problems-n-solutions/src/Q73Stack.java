
class StackException extends Exception{
    public StackException(String message){
        super(message);
    }
}

class Stack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data = new int[size];
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    private boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean push(int value){
        if(isFull()){
            System.out.print("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack!!");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from empty stack!!");
        }
        return data[ptr];
    }
}

public class Q73Stack {
    public static void main(String[] args) throws StackException{
        Stack st = new Stack(5);

        st.push(4);
        st.push(9);
        st.push(12);
        st.push(2);
        st.push(3);

        System.out.println(st.peek());

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
