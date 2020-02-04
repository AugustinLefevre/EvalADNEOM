package com.ADNEOMEval.augustinLefevre;

import java.util.*;

public class Solution {
	/*
	 * Method: partition()
	 * Take a list of integer and a int
	 * Return a list of integer lists
	 */
	ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> list, int sublistMaxSize){
		// Error management
		if(sublistMaxSize <= 0) {
            throw new IllegalArgumentException("Parameter sublistMaxSize must be greater than zero.");
        }
		if(list.size() <= 0) {
            throw new IllegalArgumentException("Empty list are not allowed.");
        }
		
        // Declare the list to return
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		// Add the sub-lists with a maximum number of elements
		int count = 0;
		while(count < list.size()/sublistMaxSize) {
			ArrayList<Integer> sublist = new ArrayList<Integer>();
			for(int i = 0; i< sublistMaxSize; i++) {
				sublist.add(list.get(i+count*sublistMaxSize));
			}
			res.add(sublist);
			count++;
		}
		
		// Add the last sub-list if it's needed
		if(list.size()%sublistMaxSize!=0) {
			ArrayList<Integer> sublist2 = new ArrayList<Integer>();
			count *= sublistMaxSize;
			while(count<list.size()) {
				sublist2.add(list.get(count));
				count++;
			}
			res.add(sublist2);
		}
		return res;
	}
	
}
