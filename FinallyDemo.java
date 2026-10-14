class FinallyDemo
{
	static void methA()
	{
		try
		{
			System.out.println("Incide methA");
			throw new RuntimeException();
		}
		finally
		{
			System.out.println("meth A final");
		}
	}
	static void methB()
	{
		try
		{
			System.out.println("Incide methB");
			return;
		}
		finally
		{
			System.out.println("meth B final");
		}
	}
	static void methC()
	{
		try
		{
			System.out.println("Incide methc");
		}
		finally
		{
			System.out.println("meth C final");
		}
	}
 
	public static void main(String args[])
	{
		try
		{
			methA();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		methB();
		methC();
	}
}
	