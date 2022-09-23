package main;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Collection {

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
		
		System.out.println("stack practice");
		Stack st = new Stack();
		st.add(1);
		st.add("my");
		st.add(true);
		st.pop();
		System.out.println(st);
		
		System.out.println("Queue practice");
		Queue queue = new PriorityQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		System.out.println(queue);
		
		ArrayList al = new ArrayList();
		al.add("abc");
		
		// Set is interface that extends Collection
		/**
	     * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
	     * default initial capacity (16) and load factor (0.75).
	     */
		System.out.println("Set practice");
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
		
		// HashTable synchronized collections
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>(10);
//		ht.put("Umar", 1);
//		ht.put("Ali", 2);
//		ht.put("Hassan", 3);
		
		// Vector synchronized
		Vector v = new Vector(10);
		v.add('a');
		v.add(1);
		v.add("hello");
		v.add(null);
		v.add(1);
		System.out.println(v.toString());
		
		Map m = new HashMap(3);
		m.put(1, 100);
		m.put(2, 200);
		m.put('3', "300");
		System.out.println(m.toString());
	}

}
