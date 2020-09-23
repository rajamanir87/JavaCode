package CodePractiseVersion1;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveduplicateInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(1);
		a.add(1);
		a.add(3);
		a.add(2);
		
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		HashSet<Integer> b=new HashSet<Integer>();
		b.addAll(a);
		System.out.println(b);
	}

}
