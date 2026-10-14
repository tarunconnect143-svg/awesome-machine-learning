Class Exc2
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			b=0;
			a=40/b;
			System.out.println("not printed");
		}
		catch(ArithmeticException e)
		{
			Systm.out.println(e);
		}
	}
}