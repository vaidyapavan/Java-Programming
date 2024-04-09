package DSA;

import DSA.linkedlist.node;

public class Linkedlist1 {
	int size;
	Linkedlist1()
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
    public void deleteFirst()
    {
    	if(head==null)
    	{
    		 System.out.println("Linked list is empty");
    		
    	}
    	size--;
    	head=head.next;
    }

    
    public void deleteLast()
    {
    	if(head==null)
    	{
    		 System.out.println("Linked list is empty");
    		
    	}
    	size--;
    	if(head.next==null)
    	{
    		head=null;
    	}
    	node secondLast=head;
    	node lastNode=head.next;
    	
    	while(lastNode.next!=null)
    	{
    		lastNode=lastNode.next;
    		secondLast=secondLast.next;
    	}
    	secondLast.next=null;
    }
    
    public int getSize()
    {
    	return size;
    }
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.addFirst("A");
        obj.addFirst("is");
        obj.PrintList();
        obj.addLast("list");
        obj.PrintList();
        obj.deleteFirst();
        obj.PrintList();
        obj.deleteLast();
        obj.PrintList();
        System.out.println(obj.getSize());
    }
}
