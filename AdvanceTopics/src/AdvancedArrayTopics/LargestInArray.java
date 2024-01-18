package AdvancedArrayTopics;

public class LargestInArray {

	public static void main(String[] args) {
		
		
		int[] array = new int[]{1,24,42,48,51,722,352,5,46,74,8};
		
		int largest = array[0];
		
		try {
			for(int i=1; i<313;i++) {
				if(largest < array[i]) {
					largest = array[i];
				}
			}
		}
		catch(IndexOutOfBoundsException s) {
			System.out.print("");
		}
		
		System.out.println("The Larget One is " + largest);
	}
}
