package main;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {

	public static void main(String[] args) {
		// Find the number occurrence from the following array
		int []arr = {1,2,3,1,1,1,2,4,5,8,0,2,2,2,2,4,5,1,3,5,6,1,0,1};
		hardWay(arr);
		easyWay(arr);
	}
	public static void hardWay(int []arr) {
				
				int number = 0;
				int maxValue = -1;
				Map<Integer,Integer> m = new HashMap<Integer,Integer>();
				
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]>maxValue)
						maxValue=arr[i];
				}
				System.out.println("max: "+maxValue);
				int temp;
				for (int i = 0; i < arr.length; i++) {
					temp = arr[i];
					// populate map with unique numbers
					if(!m.containsKey(temp))
						m.put(temp, 0);
				}
				System.out.println(m.toString());
				int value = 0;
				Map<Integer,Integer> m2 = new HashMap<Integer,Integer>();
				for (int i = 0; i < maxValue+1; i++) {
					if(m.containsKey(i)) {
						value = m.get(i);
					for (int j = 0; j < arr.length; j++) {
					// add value +1 for new occurance in the array
							if(i==arr[j]) {
								value++;
								m2.put(i, value);
//								System.out.println("value"+value);
							}
						}
						
					}
					value=0;
				}
				int maxNumber=-1;
				System.out.println(m2.toString());
				for (int i = 0; i < maxValue-1; i++) {
					if(m2.get(i)>maxNumber) {
						maxNumber = m2.get(i);
						number = i;
					}
				}
				
				System.out.println("max repeated number is "+number+" and its occurance is "+maxNumber);
	}
	public static void easyWay(int []arr) {
				
				Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				for (int i = 0; i < arr.length; i++) {
		            // populate map with unique numbers
		            if(!map.containsKey(arr[i]))
		                map.put(arr[i], 1);
		            else {
		                map.put(arr[i], map.get(arr[i])+1);
		            }

		        }
				System.out.println(map.toString());
	}
}
