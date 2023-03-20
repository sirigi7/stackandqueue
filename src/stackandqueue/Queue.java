package stackandqueue;

public class Queue {
    MyLinkedList qList = new MyLinkedList();
    public void enqueu(Object data) {
        qList.addLast(data); // Calling the add last method of Mylinkedlist to add elements at the end of the Queue.
    }
    public void displayQueue() {
        qList.printNode();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueu(56);
        queue.enqueu(30);
        queue.enqueu(70);
        queue.displayQueue();
    }

}
