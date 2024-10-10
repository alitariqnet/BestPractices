package Java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
class WC{
	int length;
	int height;
	int width;	
}

public class Practice {

	public static void main(String[] args) {

		
		 WC obj1 = new WC();
		 WC obj2 = new WC();
//		 obj2.height=obj1.height;
//		 obj2.length=obj1.length;
//		 obj2.width=obj1.width;
		 
		 obj1.height=1;
		 obj1.length=2;
		 obj1.width=3;
		 obj2=obj1;
		 System.out.println(obj1.length);
		 obj2.length=5;
		 System.out.println(obj1.length);
		 
		 
		String myShop = "This is my shop";
		HashMap<String,String> myMap = new HashMap<String, String>();
		Hashtable<String,String> myTable = new Hashtable<String,String>();
		
		System.out.println(myShop.length());
		String []myNewShop = myShop.split(" ",4);
		
		System.out.println(myShop);
		for(int i = 0;i<myNewShop.length;i++) {
			System.out.println(myNewShop[i]);
			myMap.put("key"+i,myNewShop[i]);
		}
		System.out.println("word count: "+myMap.size());
		
		for(int i=0;i<myMap.size();i++) {
			System.out.println(myMap.get("key"+i));
		}
		
		myTable.putAll(myMap);
		System.out.println(myTable.values().toString());
		System.out.println(myTable.containsValue("shop"));
		System.out.println("only value from myMap :"+myMap.values().toString());
		
		String ns1 = myMap.get(0);
		
		System.out.println("ns1 :"+ns1);
		System.out.println(myMap.toString());
		System.out.println(myMap.hashCode());
		myMap.remove("key2");
		System.out.println(myMap.toString());
		System.out.println(myMap.hashCode());
		
		Set mySet = new HashSet();
		mySet.add("Hello");
		mySet.add(" world!");
		mySet.add(123);
		mySet.add(123);
		mySet.remove(123);
		System.out.println(mySet.toString());
		System.out.println(mySet.hashCode());
		System.out.println(mySet.contains(123));
		System.out.println(mySet.size());
		System.out.println(mySet.remove(123));
		System.out.println(mySet.toString());
		System.out.println(mySet.hashCode());
		mySet.add(",I");
		System.out.println(mySet.hashCode());
		mySet.add(" am");
		System.out.println(mySet.hashCode());
		mySet.add(" Ali");
		System.out.println(mySet.hashCode());
		mySet.add(1234);
		Iterator i = mySet.iterator();
		Object o;
		int countString=0;
		int countInt=0;
		
		Vector<String> st = new Vector();
		Vector<Integer> in = new Vector();
		
		while(i.hasNext()) {
			o=i.next();
			if(o instanceof String) {
				countString++;
				st.add((String)o);
			}
			if(o instanceof Integer) {
				countInt++;
				in.add((int)o);
			}
		}
		System.out.println(in.size());
		System.out.println(st.toString());
		System.out.println(in.toString());
		System.out.println(mySet.toString());
		System.out.println("count string :"+countString);
		System.out.println("count int :"+countInt);
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("abcdef");
		System.out.println(sb.hashCode());
		sb.append(false);
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		System.out.println(Collections.max(in));
		
		String g = "Hello world";
		System.out.println("string contains hello ?"+g.contains("hello"));
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"a");
		m.put(2,"A");
		m.put(3,"7");
		m.put(4,"d");
		m.put(5, null);
		m.put(null, "m");
		m.put(null, "n");
		System.out.println(m);
		
		List l = new ArrayList();
		l.add("A");
		l.add(0, "B");
		System.out.println(l.toString());
		
		HashSet mySet1 = new HashSet();
		HashSet mySet2 = new HashSet();
		
		mySet1.add(1);
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(5);
		mySet1.add(9);
		mySet1.add(null);
		mySet2.add(8);
		mySet2.add(6);
		mySet2.add(7);
		mySet2.add(4);
		mySet2.add(1);
		
		
		int h;
		int rem;
		boolean b;
		int countPairs = 0;
		Iterator it = mySet1.iterator();
		while (it.hasNext()) {
			h = (int) it.next();
			rem = 9-h;
			b = mySet2.contains(rem);
			if(b)
			countPairs++;
			
		}
		System.out.println(countPairs);
		
		ArrayList<Integer> al = new ArrayList();
		al.add(2);
		al.add(3);
		al.add(5);
		int x = al.get(2);
		System.out.println(x);
		int y = in.get(0);
		System.out.println(y);
		
		  String s1="Sachin";  
		  String s2="Sachin";  
		  if(s1==s2)
		  System.out.println(s1==s2);
	}
	
	

}
