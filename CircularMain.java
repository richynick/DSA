import LinkedList.CircularLinkedList;

public class CircularMain {
    public static void main(String[] args){
        CircularLinkedList cLL = new CircularLinkedList();
        cLL.createCircularLinkedList(5);
        System.out.println(cLL.head.value);
    }
}
