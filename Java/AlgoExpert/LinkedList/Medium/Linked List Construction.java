import java.util.*;

// Feel free to add new properties and methods to the class.
class Program {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
            if (head == null) {
                head = node;
                tail = node;
                return;
            }

            insertBefore(head, node);
        }

        public void setTail(Node node) {
            // Write your code here.
            if (tail == null) {
                setHead(node);
                return;
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
            remove(nodeToInsert);

            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;

            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
            remove(nodeToInsert);

            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;

            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
            Node current = head;
            int currentPos = 1;

            while (currentPos < position) {
                current = current.next;
                currentPos++;
            }

            if (current == null) {
                if (tail != null)
                    insertAfter(tail, nodeToInsert);
                else
                    setTail(nodeToInsert);
            }
            else {
                insertBefore(current, nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
            Node current = head;

            while (current != null) {
                Node nodeToRemove = current;
                current = current.next;
                if (nodeToRemove.value == value)
                    remove(nodeToRemove);
            }
        }

        public void remove(Node node) {
            // Write your code here.
            if (node == null) return;
            if (head == node) head = node.next;
            if (tail == node) tail = node.prev;
            removeNodeBindings(node);
        }

        public void removeNodeBindings(Node node) {
            if (node.prev != null) node.prev.next= node.next;
            if (node.next != null) node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            Node current = head;

            while (current != null) {
                if (current.value == value) return true;
                current = current.next;
            }

            return false;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
