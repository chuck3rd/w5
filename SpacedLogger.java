

public class SpacedLogger implements Logger
{

	@Override
	public void Log(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("");		
	}
  
	
	
	@Override
	public void Error(String s) 
	{		
		System.out.print("ERROR: " );
		for(int i = 0; i < s.length(); i++)
		{
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("");	
	}
}