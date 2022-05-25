package main;

import java.util.HashMap;
import java.util.Map;

public class Loops {

	public static void main(String[] args) {
		
		int []temp = {1,2,3,5,4,6,2,1,8,9,3};
		int []temp2 = new int[2];
		int target = 7;
		
		long time = System.nanoTime();
		temp2 = twoSum(temp, target);
		System.out.println("time taken by n complexity: "+ (System.nanoTime()-time));
		
		temp2=new int[2];
		
		time = System.nanoTime();
		temp2 = twoSum2(temp, target);
		System.out.println("time taken by n*n complexity: "+ (System.nanoTime()-time));
		
	}
	
	// find sum of two numbers in a array with n complexity
	    public static int[] twoSum(int[] nums, int target) {
	        
	        int []temp = new int[2];
//	        long time = System.nanoTime();
	        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
//	        System.out.println("time taken for creating map: "+ (System.nanoTime()-time));
	        
	        for(int i=0; i<nums.length;i++){
	           
	            if(m.containsKey(target-nums[i])){
	                
	                temp[0]=m.get(target-nums[i]);
	                temp[1]=i;
	                return temp;
	            }
	             m.put(nums[i],i);
	        }
	        
	        return null;
	    }
	    
	 // find sum of two numbers in a array with n*n complexity
	    public static int[] twoSum2(int[] nums, int target) {
	        
	        int []temp = new int[2];
	        
	        for(int i=0; i<nums.length;i++){
	        	for(int j=0; j<nums.length;j++){
	            if(nums[i]+nums[j]==target&&i!=j){
	                
	                temp[0]=nums[i];
	                temp[1]=nums[j];
	                return temp;
	            }
	        }
	        }
	        return null;
	    }
}
