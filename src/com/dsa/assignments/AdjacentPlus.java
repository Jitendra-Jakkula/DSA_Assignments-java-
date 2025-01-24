package com.dsa.assignments;

import java.util.Arrays;

public class AdjacentPlus{
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    int n = arr.length;
    int st = 0;
    int end = n-1;
    if(n%2 != 0){
        System.out.println("Array length should be even");
        return;
    }
    int sum[]= new int[n/2];

    while(st < end){
        sum[st]= arr[st] + arr[end];
        st++;
        end--;
    }
    System.out.println(Arrays.toString(sum));
    
    }
}


