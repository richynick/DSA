package LinkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertInLinkedList(int nodeValue, int location){
        Node node  = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }else if (location == 0) {
            node.next = head;
            head = node;
        }else if (location>= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else{
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traversalLinkedList(){
        if(head == null){
            System.out.println("singleLinkedList is empty");
        } else{
            Node tempNode = head;
            for(int i = 0; i<=size; i++){
                System.out.println(tempNode.value);
                if(i != size-1){
                    System.out.println(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchSingleLinkedList(int nodeValue){
        if(head != null) {
            Node tempNode = head;
            for(int i = 0; i<=size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Value found at" + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head != null) {
            if (location == 0) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null;
                }
            } else if (location >= size) {

            }
        }
        System.out.println("The LinkedList does not exist");
        return;
    }
    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}
