

public class AsteriskLogger implements Logger
{
	@Override
	public void Log(String s)
	{
		System.out.println("***" + s + "***");		
	}
	
	

	@Override
	public void Error(String s)
	{
		System.out.println("******************");		
		System.out.println("***ERROR: " + s + "***");
		System.out.println("******************");		
	}	
}