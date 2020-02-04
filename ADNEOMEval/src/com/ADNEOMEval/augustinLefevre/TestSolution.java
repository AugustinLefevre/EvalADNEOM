package com.ADNEOMEval.augustinLefevre;

//import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class TestSolution {

	@Test
	public void test3PartBy2() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1, 2, 3};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, 2);
		
		ArrayList<ArrayList<Integer>> expect = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		Collections.addAll(expect, list2);
		Collections.addAll(expect, list3);
		Assert.assertEquals(expect,actual);
	}
	@Test
	public void test4PartBy2() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1, 2, 3, 4};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, 2);
		
		ArrayList<ArrayList<Integer>> expect = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		list3.add(4);
		Collections.addAll(expect, list2);
		Collections.addAll(expect, list3);
		Assert.assertEquals(expect,actual);
	}
	@Test
	public void test1PartBy1() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, 1);
		
		ArrayList<ArrayList<Integer>> expect = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		Collections.addAll(expect, list2);
		Assert.assertEquals(expect,actual);
	}
	
	@Test
	public void test3PartBy5() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1, 2, 3};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, 5);
		
		ArrayList<ArrayList<Integer>> expect = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Collections.addAll(expect, list2);
		Assert.assertEquals(expect,actual);
	}
	
//JUnit4
	@Test(expected = IllegalArgumentException.class)
	public void test1PartByNegative() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, -1);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void test1PartBy0() {
		Solution solution = new Solution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer[] arr = new Integer[] {1};
		Collections.addAll(list, arr);
		
		ArrayList<ArrayList<Integer>> actual = solution.partition(list, 0);
		
	}

}
