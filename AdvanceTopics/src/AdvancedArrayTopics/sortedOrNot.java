package AdvancedArrayTopics;

public class sortedOrNot {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,6,8,14,19,23,38,39,10};
		
		int start = arr[0] , end = arr[arr.length-1],count =1;
		
		
		for(int i=1; i<arr.length-2;i++) {
			
			if(arr[i] <= end && arr[i] >= start) {
				
				count++;
			}
			
			
		}
		if(count==arr.length-2) {
			System.out.println("Sorted Array");
		}
		else {
			System.out.println("UnSorted Array");
		}

	}

}
