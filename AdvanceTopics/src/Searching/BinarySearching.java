package Searching;

public class BinarySearching {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-1,-25,1,2,23,24,34,64,758,986,1004};
		
		int result = BinarySearch(arr,22);
		
		System.out.println(result );
		
	
	}
	static int BinarySearch(int[] arr,int target) {
		
		int start = 0,end = arr.length-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			if(target>arr[mid]) {
				start = mid+1;
			}
			else if(target<arr[mid]){
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}
