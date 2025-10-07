
@FunctionalInterface
interface Greeting
{
	void sayhello(String name);
}



public class FunctionalInterfaceExample {
	
	public static void main(String[] args) 
	{
		 Greeting greet = n -> System.out.println("Hello "+n);
		 greet.sayhello("Sunil");
	}

}
