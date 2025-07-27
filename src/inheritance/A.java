package inheritance;

class B {
	int x = 5;
	void show()
	{
		System.out.println("Show method");
	}
}

public class A extends B
{
	int y = 13;
	void display()
	{
		System.out.println("Display method");
	}
	public static void main(String args[])
	{
		A ob = new A();
		System.out.println(ob.x);
		System.out.println(ob.y);
		ob.show();
		ob.display();
	}
}