package com.dsa.assignments;

public class Sum {
	

		public static void main(String[] args) {
			int[] input = {123,456,789};
			System.out.print("[");
			for(int i=0;i<input.length;i++) {
				int sum = 0;
				int num = input[i];
				while (num>0) {
					sum += num%10;
					num /= 10;
				}
				System.out.print(sum);
				if(i<input.length-1) {
					System.out.print(" ");
				}
			}
			System.out.println("]");

		}
}
