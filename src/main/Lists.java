package main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class Lists {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList();
		ll.add("hello");
		ll.add(null);
		ll.add(" world");
		ll.add(1, null);
//		ll.forEach());
		System.out.println(ll.size()+" "+ll.toString());
		String s = ll.pop();
		System.out.println(ll.size()+" "+ll.toString());
		String s2 = ll.remove();
		System.out.println(ll.size()+" "+s+" "+s2+" "+ll.toString());
		
		Stack st = new Stack();
		st.add(1);
		st.add("my");
		st.add(true);
		st.pop();
		System.out.println(st);
		
		Queue q = new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		System.out.println(q);
		
		ArrayList al = new ArrayList();
		al.add("abc");
		
		// Set is interface that extends Collection
		/**
	     * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
	     * default initial capacity (16) and load factor (0.75).
	     */
		Set set = new HashSet(); 
		// A set is the representation of the mathematical set
		set.add(0);
		// A Set can contain a null value
		set.add(null);
		set.add("Ali");
		set.add('c');
		System.out.print(set.contains('c'));
		System.out.println("");
		
		// Order of elements remains the same
		set.stream().forEach(System.out::println);
		set.remove(null);
		set.size();
		/*
		 * We need to iterate through all the elements of the set
		 * we can't get an element by index
		 */
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("");
		System.out.println(set.toString());
		
	}

}
