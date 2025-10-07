
public interface Vehicle {

	default void start()
	{
		System.out.println("Vehicle starting...");
	}

	static void stop() 
	{
		System.out.println("Vehicle stopped.");
	}


}
