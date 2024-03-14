package com.learning.core.day9;
import java.util.*;

public class D09P02 {
	public static void mergesort(int[] arr,int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
	}
	public static void merge(int[] arr,int left,int mid,int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[mid+1+j];
		}
		
		int i=0,j=0;
		int k=left;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		mergesort(arr,0,n-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
