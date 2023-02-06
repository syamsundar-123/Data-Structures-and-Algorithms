package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlassSum {
	
	public int max(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }

	public int hourGlassSum(List<List<Integer>> arr) {
		
		int sum = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;
        for(int i = 1;i<arr.size()-1;i++){
            for(int j=1;j<arr.get(i).size()-1;j++){
            currentSum =   arr.get(i).get(j) +
            				arr.get(i-1).get(j-1) + 
            				arr.get(i-1).get(j) + 
            				arr.get(i-1).get(j+1)+
            				arr.get(i+1).get(j-1) +
            				arr.get(i+1).get(j) + 
            				arr.get(i+1).get(j+1);
           
            sum = max(sum,currentSum);
            }
            
        
        }
        
        return sum;
	}
	
	public static void main(String[] args) {
		HourGlassSum hgs = new HourGlassSum();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(-1, -1, 0, -9, -2, -2));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-2 ,-1, -6, -8 ,-2, -5));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(-1 ,-1, -1, -2, -3, -4));
		List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(-1 ,-9, -2, -4, -4, -5));
		List<Integer> list5 = new ArrayList<Integer>(Arrays.asList(-7, -3, -3, -2, -9, -9));
		List<Integer> list6 = new ArrayList<Integer>(Arrays.asList(-1 ,-3, -1, -2, -4, -5));
		l.add(list1);
		l.add(list2);
		l.add(list3);
		l.add(list4);
		l.add(list5);
		l.add(list6);

		System.out.println(hgs.hourGlassSum(l));
		
	}
}
