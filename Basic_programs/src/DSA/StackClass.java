package DSA;

public class StackClass {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack {
        public Node head;
        
        public boolean isEmpty() {
            return head == null;
        }

        
        public void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
            }
            newnode.next = head;
            head = newnode;
        }
        
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(12);
        s.push(10);
        s.push(2);
        s.push(120);
        s.push(20);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
