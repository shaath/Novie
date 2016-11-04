
public class DynamicArrayeg1 
{
	public static void main(String[] args) 
	{
		int[] sal=new int[10];
		
		System.out.println(sal.length);
		
		//Writing the data into array
		
		sal[3]=40000;
		sal[5]=50000;
		sal[8]=60000;
		
		//read the data from array
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
		}
	}

}
