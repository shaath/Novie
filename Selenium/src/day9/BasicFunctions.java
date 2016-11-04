package day9;

public class BasicFunctions 
{

	public static void main(String[] args)
	{
		Function1();
		String res=Function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		fun.Function3();
		
		res=fun.Function4();
		System.out.println(res);
	}
	
	//Static Function without returning any value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static Function with returning value
	
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non static function without returning value
	
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}

	//Non static function with returning value
	
	public String Function4()
	{
		System.out.println("This is Function4 code");
		return "Fail";
	}
	
}
