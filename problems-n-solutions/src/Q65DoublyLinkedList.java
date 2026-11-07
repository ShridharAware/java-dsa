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


    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        DLL node = new DLL(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtIndex(int value, int index){
        if(index > size){
            System.out.print("Wrong index");
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }

        DLL node = new DLL(value);
        DLL temp = head;

        for(int i = 1; i < size; i++){
            temp = temp.next;
        }
        node.next = temp;
        node.prev = temp.prev;
        node.prev.next = node;
        temp.prev = node;
        size++;
    }


    public void deleteAtIndex(int index){

        if(index < 0 || index >= size){
            System.out.println("Wrong index");
            return;
        }

        if(index == 0){
            head = head.next;

            if(head != null){
                head.prev = null;
            }else{
                tail = null;
            }

            size--;
            return;
        }

        if(index == size - 1){
            tail = tail.prev;
            tail.next = null;

            size--;
            return;
        }

        DLL temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
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
        node.insertLast(50);
        node.insertAtIndex(35, 3);
        node.deleteAtIndex(3);

        node.displayForward();
        node.displayReverse();
    }
}
