package AdvancedArrayTopics;
import java.util.Arrays;

public class SecondBiggestElement {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3,34,45,16,19,238,1824,54,912,124,244,66,58,448,423,7,23,1824,23,97,97};
		
		int[] Sortedarr = Sort(arr);
		System.out.println(Arrays.toString(arr));
		int SecondLargest = SecondLargest(Sortedarr);
		System.out.println(arr[SecondLargest]);
		

	}
	public static int SecondLargest(int[] arr) {
		int first=arr[2], second =0 ;
		
		for(int i=0;i<arr.length;i++) {
			
//			if(first < arr[i]) {
//				second = first;
//				first = arr[i];
//				
//			}
		}
	
		return second;
		
	}
	public static int[] Sort(int[] arr) {
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
			
				if(arr[i]>arr[j]) {
//					Activate the Swap
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
}
