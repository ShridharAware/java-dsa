class DLL{
    private int value;
    private int size;
    private DLL next;
    private DLL prev;
    private DLL head;
    private DLL tail;

    DLL(){
        this.size = 0;
    }

    DLL(int val){
        this.value = val;
    }


    public void insertFirst(int value) {
        DLL node = new DLL(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void displayForward() {
        System.out.println("Forward Display");
        DLL node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println(" END");
    }

    public void displayReverse() {
        System.out.println("Backward Display");
        DLL node = tail;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println(" Start");
    }
}

public class Q65DoublyLinkedList {
    public static void main(String[] args){
        DLL node = new DLL();
        node.insertFirst(10);
        node.insertFirst(20);
        node.insertFirst(30);
        node.insertFirst(40);

        node.displayForward();
        node.displayReverse();
    }
}
