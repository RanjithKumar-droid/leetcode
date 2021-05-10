// https://leetcode.com/problems/merge-sorted-array/
package easy;

import java.util.Arrays;

public class Mergesortedary {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int j=0;
		for(int i = m; i<nums1.length;i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);
	}
	
	public static void main(String[] args) {
		Mergesortedary obj = new Mergesortedary();
		int arr[] = {1,2,3,0,0,0};
		int m = 3;
		int arr2[] = {2,5,6};
		int n = 3;
		obj.merge(arr,m,arr2,n);
		System.out.print("merged sorted array is: ");
		for(int j: arr) {
			System.out.print(j);
		}
	}
}
