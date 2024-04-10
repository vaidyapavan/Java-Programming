package DSA;

import DSA.linkedlist.node;

public class Reverse_linkedlist {
	int size;
	Reverse_linkedlist()
	{
		this. size=0;
	}
    node head;

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add at head
    public void addFirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    // add at tail
    public void addLast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = newnode;
        }
    }

    // print node
    void PrintList() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            node currnode = head;
            while (currnode != null) {
                System.out.print(currnode.data + "->");
                currnode = currnode.next;
            }
            System.out.println("Null");
        }
    }
    
    
    
    public void reveraeiterate()
    {
    	if(head==null || head.next==null)
    	{
    		System.out.println("only one element is there in linkedlist");
    	}
    	node prevNode= head;
    	node currNode=head.next;
    	while(currNode!=null)
    	{
    		node nextNode=currNode.next;
    		currNode.next=prevNode;
    		prevNode=currNode;
    		currNode=nextNode;
    	}
    	head.next=null;
    	head=prevNode;
    }

	public static void main(String[] args) {
		Reverse_linkedlist obj = new Reverse_linkedlist();
        obj.addFirst("A");
        obj.addFirst("is");
        obj.PrintList();
        obj.addLast("list");
        obj.PrintList();
        obj.reveraeiterate();
        obj.PrintList();
       
		

	}

}
