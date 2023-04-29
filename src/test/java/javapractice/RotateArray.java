package javapractice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int shift = 2;
	    int[] leftRotated = rotateArrayLeft(arr, shift);
	    //int[] rightRotated = rotateArrayRight(arr, shift);
	    System.out.println("Original Array: " + Arrays.toString(arr));
	    System.out.println("Shift : " + shift);
	    System.out.println("Left Rotation: " + Arrays.toString(leftRotated));
	    //System.out.println("Right Roatation: " + Arrays.toString(rightRotated));
	}

	
	public static int[] rotateArrayLeft(int[] arr, int shift) {
	    int k = shift % arr.length;
	    System.out.println("K : " + k);
	    int[] result = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        result[i] = arr[(i + k) % arr.length];
	        System.out.println("ArrPos: " + (i + k) % arr.length);
	    }
	    return result;
	}

	
	public static int[] rotateArrayRight(int[] arr, int shift) {
	    int k = arr.length - (shift % arr.length);
	    System.out.println("K : " + k);
	    int[] result = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        result[i] = arr[(i + k) % arr.length];
	        System.out.println("ArrPos: " + (i + k) % arr.length);
	    }
	    return result;
	}
}
