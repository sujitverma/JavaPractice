package javapractice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] leftrotate = rotateArrayLeft(arr, 8);
		int[] rightrotate =rotateArrayRight(arr, 8);
		System.out.println(Arrays.toString(leftrotate));
		System.out.println(Arrays.toString(rightrotate));


	}
	public static int[] rotateArrayLeft(int[] arr, int shift) {
	    int k = shift % arr.length;
	    int[] result = Arrays.copyOf(arr, arr.length);
	    reverseArray(result, 0, k-1);
	    reverseArray(result, k, result.length-1);
	    reverseArray(result, 0, result.length-1);
	    return result;
	}
	public static int[] rotateArrayRight(int[] arr, int shift) {
	    int k = arr.length - (shift % arr.length);
	    int[] result = Arrays.copyOf(arr, arr.length);
	    reverseArray(result, 0, k-1);
	    reverseArray(result, k, result.length-1);
	    reverseArray(result, 0, result.length-1);
	    return result;
	}

	private static void reverseArray(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}


}
	
