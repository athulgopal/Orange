package com.java.groom.array;

/*
 * /**
Given a sorted array of n integers that has been rotated an unknown number of times, 
write code to find an element in the array. The array was originally sorted in increasing order.
[5 6 7 8 10 1 2 3 4]
 */

public class FindInRotatedArray {

	public  int smallest(int[]arr, int left, int right) {

		if(left > right) return arr[0];
		if(left == right) return arr[left];
		
		int mid=(left+right)/2;
		
		if(mid > left && arr[mid] < arr[mid-1]) return mid;
		if(mid < right && arr[mid] > arr[mid+1]) return mid+1;
		
		if(arr[right] > arr[mid]) return smallest(arr, left, mid-1);
		else return smallest(arr, mid+1, right);
	}
	
	private int searchBinary (int[] arr, int left, int right, int searchVal) {
		
		int mid = (left + right) / 2;
		if (left > right || left < 0 || right > arr.length) return -1;
		if (arr[mid] == searchVal) return mid;
		if (searchVal < arr[mid]) return searchBinary(arr, left, mid - 1, searchVal);
		else return searchBinary(arr, mid + 1, right, searchVal);
	}
	
	public int search (int[] input, int searchVal) {
		int smallIndex = smallest(input, 0, input.length);
		if (searchVal > input[input.length -1 ])
			return(searchBinary(input, 0, smallIndex, searchVal));
		else 
			return(searchBinary(input, smallIndex, input.length, searchVal));
	}
	
	public static void main(String[] args) {
		FindInRotatedArray array=new FindInRotatedArray();
		int[] input = new int[] {5,6,7,8,9,10,1,2,3,4};
		System.err.println(array.search(input, 5));
	}
	
}