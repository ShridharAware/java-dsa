class Node{
    private int value;
    private int size;
    private Node next;
    private Node head;
    private Node tail;

    public Node(){
        this.size = 0;
    }

    public Node(int val){
        this.value = val;
    }

    public Node(int val, Node next){
        this.value = val;
        this.next = next;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        this.size++;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        if(index > size || index < 0){
            System.out.println("Wrong index");
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        this.size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        this.size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void deleteFirst() {
        if(size == 0){
            System.out.println("No elements in list");
            return;
        }
        head = head.next;
        this.size--;
    }

    public void deleteLast() {
        if(size == 0){
            System.out.println("No elements in list");
            return;
        }
        Node temp = head;
        for(int i = 1; i < size-1; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        this.size--;
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            deleteFirst();
        }
        if(index > size){
            System.out.println("Wrong index");
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node current = temp.next;
        temp.next = current.next;
        this.size--;
    }
}

public class Q64LinkedList {
    public static void main(String[] args){
        Node node = new Node();
        node.insertFirst(30);
        node.insertFirst(20);
        node.insertFirst(10);
        node.display();

        node.insertLast(30);
        node.insertLast(20);
        node.insertLast(10);
        node.display();

        node.insertAtIndex(330, 1);
        node.display();

        node.deleteFirst();
        node.display();

        node.deleteLast();
        node.display();

        node.deleteAtIndex(1);
        node.display();
    }

}
