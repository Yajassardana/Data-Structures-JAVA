package week1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSlidingWindow {
	public static int [] maxSlide(int arr[],int window) {
		int result [] = new int [window];
		return result;
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int [] arr = new int[size];
	for(int j = 0; j<size;j++) {
		arr[j] = s.nextInt();
	}
	int window  = s.nextInt();
	System.out.println(Arrays.toString(maxSlide(arr,window)));
}

}
