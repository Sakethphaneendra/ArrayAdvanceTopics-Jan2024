package Sorting;
import java.util.Arrays;
public class DecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {134,3464,57,42,3534,57,7,15,32,2,345,68,7,43,17};
		int temp;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
//					Activate the Swap
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
