
public class reverseString
{
	public static void main(String[] args) 
	{
		String Original="DAD";//----->egdEQ
		
		String Reverse="";
		//length of the string
		
		int len=Original.length();
		System.out.println(len);
		
//		for (int i = 0; i < len; i++)
//		{
//			System.out.println(Original.charAt(i));
//			
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{
			Reverse=Reverse+Original.charAt(i);
//			System.out.print(Original.charAt(i));
		}
		System.out.println(Reverse);
		
		if (Original.equalsIgnoreCase(Reverse))
		{
			System.out.println("Given String is polyndrome");
		}
		else
		{
			System.out.println("Given String is not a Polyndrome");
		}
	}

}
