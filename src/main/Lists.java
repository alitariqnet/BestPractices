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
		
		Set set = new HashSet(); 
		set.add(0);
		set.add(null);
		set.add("Ali");
		set.add('c');
		set.add(null);
		System.out.println(set.toString());
	}

}
