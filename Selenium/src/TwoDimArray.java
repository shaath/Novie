
public class TwoDimArray 
{
	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		
		//length of the array row
		
		System.out.println(s.length);
		
		//length of the columns
		System.out.println(s[0].length);
		
		//writing the data into array
		
		s[1][1]="Selenium";
		
		
		//Read the data from array
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
			}
			
		}
	}

}
