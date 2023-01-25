
public class App 
{

	public static void main(String args[])
	{		
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger1.Log("hello");
		logger1.Error("hello");
		logger2.Log("hello");
		logger2.Error("hello");
	}
}