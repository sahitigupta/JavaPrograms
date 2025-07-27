package inheritance;

class Demo {
	int x = 5;
}
public class SuperkeyUsage extends Demo
{
	int x = 10;
	void print()
	{
		int x = 15;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String args[])
	{
		SuperkeyUsage ob = new SuperkeyUsage();
		ob.print();
	}
}
