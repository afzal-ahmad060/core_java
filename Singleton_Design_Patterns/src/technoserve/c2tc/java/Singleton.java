package technoserve.c2tc.java;

public class Singleton {
	static Singleton instance = new Singleton();
	public static String s;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getSingleInstance()
	{
		return instance;
	}

}
