package com.dsa.assignments;

public class Product {
	public static void main(String[] args) {
		int[] input = {12,34,56};
		System.out.print("[");
		for(int i=0;i<input.length;i++) {
			int product = 1;
			int num = input[i];
			while(num > 0) {
				product *= num%10;
				num /= 10;
			}
			System.out.print(product);
			if(i<input.length-1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
	}


}
