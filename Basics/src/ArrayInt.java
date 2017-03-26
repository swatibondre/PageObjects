import java.util.*;
public class ArrayInt {
	
	public static void main(String args[])
	{
		ArrayInt.get_and_print(6);
	}
	
	public static void get_and_print(int n)
	{
//		int arr[] = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]= (new Scanner(System.in)).nextInt();
//		}
//		System.out.println("Your value: ");
//		for(int i : arr)
//		{
//			System.out.print(i+" ");
//		}
		int arr[]= {23,25,32,23,23,48};
		for(int j=0; j<5 ;j++)
		{
		
			int count = 0;
			for(int k= j+1; k<5; k++)
			{
				
				if(arr[j]==arr[k])
				{
					count=count++;
				//	System.out.println("Duplicate count:"+ count);
					System.out.println(arr[k]);
				}
				
				
			}
			
			
		}
		
	}

}
