package Searching;
import java.util.*;
public class orderAgnosticBinarySearch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int Size = in.nextInt();
		int[] arr = new int[Size];
		System.out.print("Enter Sorted Elements : ");
		for(int i=0;i<Size;i++) {
			arr[i] = in.nextInt();
		}
		System.out.print("Enter the Target to Search : ");
		int Target = in.nextInt();

		
	System.out.println(Arrays.toString(arr));
		int val;
		if(arr[0] < arr[arr.length-1]) {
			
			val = AscendingOrder(arr, Target);
			System.out.println(val);
		}
		else {
			
			 val = DesendingOrder(arr ,Target);
			 System.out.println(val);
		}
		
	}
	
	public static int AscendingOrder(int[] arr , int target){
		int start=0,end=arr.length-1,mid;
		
		while(start<=end) {
			mid= (start+end)/2;
			if(arr[mid] < target) {
				start = mid+1;
			}
			else if(arr[mid] > target){
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static int DesendingOrder(int[] arr, int target){
		
		int start=0,end=arr.length-1,mid;
		
		while(start<=end) {
			mid= (start+end)/2;
			if(arr[mid] < target) {
				end = end-1;
			}
			else if(arr[mid] > target){
				start = start+1;
			}
			else {
				return mid;
			}
			
		}
		
		return -1;
	}

}
