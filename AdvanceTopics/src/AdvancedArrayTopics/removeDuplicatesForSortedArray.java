package AdvancedArrayTopics;
import java.util.Arrays;
public class removeDuplicatesForSortedArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-20,-20,-10,-10,-5,-5,-3,12,15,15,15,17,17,19,20,32,32,65,68,70,70};
		System.out.println(Arrays.toString(arr));
		
		int dum =arr[0],in=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(dum!=arr[i]) {
				in++;
				arr[in] =arr[i];
				dum=arr[in];
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}