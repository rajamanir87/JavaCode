package Java7102020;

public class findMiddleElementinLinkedList {
    static Node head;
    static class Node{
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data=d;
    		next=null;
    	}
    }
    
    void findMiddleElement() {
    	Node fast=head;
    	Node slow=head;
    	if(head!=null) {
    	while(fast!=null&&fast.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	System.out.println(slow.data);
    	}
    }
    void printList(Node node) {
    	node=head;
    	while(node!=null) {
    	System.out.println(node.data);
    	node=node.next;
    	}
    }
	public static void main(String[] args) {
		findMiddleElementinLinkedList ll=new findMiddleElementinLinkedList();
		ll.head=new Node(10);
		ll.head.next=new Node(20);
		ll.head.next.next=new Node(30);
		ll.head.next.next.next=new Node(40);
		ll.head.next.next.next.next=new Node(50);
		ll.head.next.next.next.next.next=new Node(60);
		//ll.printList(head);
		ll.findMiddleElement();
		
		//ll.printList(head);

	}

}
