class MultiCatch
{
	public static void main (String args[])
	{
		try
		{
			int a=args.length;
			int b=10/a;
			int c[]={1,2,3};
			int c[8]=67;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero:"+e);
		}
		catch(ArrayIndexOfBoundsException e)
		{
			System.out.println("Array index oob:"+e);
		}
	}
}

