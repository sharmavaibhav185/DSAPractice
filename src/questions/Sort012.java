package questions;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		
		int[] arr = {2,0,0,0,1,0};
		sortIt(arr);
		
		
	}
	
	public static void sortIt(int[] arr)
	{
		//System.out.println(Arrays.toString(arr));
		int start=0,mid=0,end=arr.length-1;
		
		while(mid < end)
		{
			
			if(arr[start] == 0)		// do nothing
			{
				start++;
				mid++;
			}
			if(arr[start] == 1)		// swap start with mid
			{
				int temp;
				temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				mid++;							
				
			}
			if(arr[start] == 2)		// swap start with end
			{
				int temp;
				temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				
				end--;
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
