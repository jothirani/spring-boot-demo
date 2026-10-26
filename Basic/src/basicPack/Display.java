package basicPack;


//Java program to demonstrate working of System.exit() 

public class Display
{ 
	public static void main(String[] args) 
	{ 
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 

		for (int i = 0; i < arr.length; i++) 
		{ 
			if (arr[i] > 4) 
			{ 
				//System.out.println("exit..."); 

				// Terminate JVM 
				//System.exit(0); 
				break;
			} 
			else
				System.out.println("arr["+i+"] = " + 
								arr[i]); 
		} 
		System.out.println("End of Program"); 
	} 
}
