package Sorting;
import java.util.Arrays;
public class AscendingOrder {

	public static void main(String[] args) {
	
	
				
				int[] arr = new int[]{10,32,14,193,14,1456,235,235,373,74,1};
				int temp,len = arr.length;
				System.out.println(Arrays.toString(arr));
				
				for(int i=0;i<len;i++)
				{
					for(int j=i;j<len;j++) {
						if(arr[i]>arr[j]) {
//							Swap it
							temp= arr[i];
							arr[i]= arr[j];
							arr[j]=temp;
						}
					}
				}
				
				
//				Print the ARRAY
				
				System.out.println(Arrays.toString(arr));
				

	}

}
