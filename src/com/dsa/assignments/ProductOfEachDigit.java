package com.dsa.assignments;

import java.util.Arrays;

public class ProductOfEachDigit {
	public static void main(String[] args) {
		int[] input = {12,34,56};
		int[] ans = new int[input.length];
		for(int i = 0;i<input.length;i++) {
			int num = input[i];
			int prod = 1;
			while(num !=0) {
				int digit  = num %10;
				prod *= digit;
				num/= 10;
			}
			ans[i] = prod;
			
		}
		System.out.println(Arrays.toString(ans));
	}
}
