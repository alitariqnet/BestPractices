package Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {
public static void main(String[] args) {
	

	String []s = {"hello","world","here"};
	for (String st: s) {
		System.out.println(st);
	}
	
	Arrays a = new Arrays();
	Arrays a1 = new Arrays();
	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	System.out.println(a1.hashCode());

	List<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(1);
	list.add(2);
	list.add(6);
	list.add(4);
	list.add(5);
	list.add(3);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	System.out.println(list);
	System.out.println(list.indexOf(6));

	/** New array list capacity for a 10 elements list would be
	 *  See {@link java.util.ArrayList#grow(int)}
	 *  Also see {@link java.util.Arrays#copyOf(U[], int, Class<? extends T[]>) }
	 */
	System.out.println(10 + (10 >> 1));

	List<Integer> _list = new LinkedList<>();
	_list.add(0);
	_list.add(1);
	_list.add(2);
	_list.add(6);
	_list.add(4);
	_list.add(5);
	_list.add(3);
	_list.add(7);
	_list.add(8);
	_list.add(9);
	_list.add(10);
	_list.remove(10);
	System.out.println(_list);
	System.out.println(_list.indexOf(6));
  }
}
