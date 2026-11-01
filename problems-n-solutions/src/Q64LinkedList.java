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
        this.size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        this.size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
    }

}
