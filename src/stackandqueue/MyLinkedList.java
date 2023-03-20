package stackandqueue;

public class MyLinkedList {
        MyNode head;

        public void addFirst(Object data) {   // To add a node before head and make that node as head.
            MyNode newNode = new MyNode(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(Object data) {  // To add a node at last of the linked list.
            MyNode newNode = new MyNode(data);
            if (head == null) {
                head = newNode;
                return;
            }
            MyNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
//        newNode.next = null;
        }

        public void insertAfter(String searchNode, Object data) { // Passing the value which i want to search(previusNode) and the new data which i want to insert.
            MyNode newNode = new MyNode(data);
            if (head == null) {
                head = newNode;
                return;
            }
            MyNode tempNode = head;
            MyNode nextNode = tempNode.next;
            while (tempNode.data != searchNode) {
                tempNode = tempNode.next;
                nextNode = nextNode.next;  //Traversing simultaneously to reach at the location where need to insert a value.
            }
            tempNode.next = newNode; //Inserting the newNode after the searched value.
            newNode.next = nextNode; // Assigning the nextNode to the newNode.next.
        }

        public void pop() {  //Deleting the first node from the linked list.
            if (head == null) {
                System.out.println("Linked list is empty...");
                return;
            }
            head = head.next; //Pointing head to the head.next so the first node will be deleted.
        }

        public void popLast() {  //Deleting the last node of the linked list.
            if (head == null) {
                System.out.println("Linked list is empty...");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            MyNode prevNode = head;
            MyNode tempNode = head.next;
            while (tempNode.next != null) {
                prevNode = prevNode.next;
                tempNode = tempNode.next;
            }
            prevNode.next = null;
        }

        public void printNode() {
            if (head == null) {
                System.out.println("Linked list is empty...");
                return;
            }
            MyNode tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.data + "=>");
                tempNode = tempNode.next;
            }
            System.out.println("null");
        }
    }


