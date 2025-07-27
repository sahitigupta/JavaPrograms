package basic;

public class WrapperClass {
	public static void main(String args[])
	{
		//Autoboxing
		int x = 5;
		//Integer ob = x;
		Integer ob = Integer.valueOf(x);
		System.out.println(ob);
		
		//Unboxing
		Integer unb = Integer.valueOf(10);
		int y = unb.intValue();
		System.out.println(y);
	}
}
