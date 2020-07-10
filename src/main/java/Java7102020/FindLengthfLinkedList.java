package Java7102020;

import org.w3c.dom.Node;

public class FindLengthfLinkedList {

	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	static int findCount() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		FindLengthfLinkedList ll=new FindLengthfLinkedList();
		ll.head=new Node(10);
		ll.head.next=new Node(20);
		ll.head.next.next=new Node(30);
		ll.head.next.next.next=new Node(40);
		ll.head.next.next.next.next=new Node(50);
		ll.head.next.next.next.next.next=new Node(50);

System.out.println(ll.findCount());
	}

}
