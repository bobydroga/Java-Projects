public class Stack {

        private Node top; // The top node of the stack
        private int size; // The number of elements in the stack

        // Private class to represent a node in the linked list that forms the stack
        private class Node {
            private int data;
            private Node next;
        }

        // Constructor to create an empty stack
        public Stack() {
            top = null;
            size = 0;
        }

        // Method to add an element to the top of the stack
        public void push(int element) {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = top;
            top = newNode;
            size++;
        }

        // Method to remove and return the element at the top of the stack
        public int pop() {
            if (top == null) {
                throw new RuntimeException("Stack is empty");
            }
            int element = top.data;
            top = top.next;
            size--;
            return element;
        }

        // Method to get the current size of the stack
        public int size() {
            return size;
        }

        // Method to generate a string representation of the stack
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = top;
            while (current != null) {
                sb.append(current.data);
                sb.append(" ");
                current = current.next;
            }
            return sb.toString();
        }

}
