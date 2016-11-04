import java.util.ArrayList;


public class ArrayListeg 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		x.add("Selenium");
		x.add("Novie");
		x.add("Sharath");
		x.add(33333);
		x.add(1, "QEdge");
		x.add("Selenium");
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
		}
	}
}
