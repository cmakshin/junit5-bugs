package packageC;

import packageB.ClassB;

public class ClassC
{
	public ClassC()
	{
		new ClassB();
		System.out.println("Hello from class C!");
	}
}
