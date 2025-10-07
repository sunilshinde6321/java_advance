import java.util.Arrays;
import java.util.List;

public class Lambda {


	public static void main(String[] args) 
	{

		List< String > names = Arrays.asList("Sunil","Ravi","Amol");


		names.forEach(name -> System.out.println("Hello " + name));
		
		
		
		names.forEach(name -> System.out.println("Hello "+ names));

//		for (String string : names) 
//		{
//
//			System.out.println("Hello "+names);
//		}




	}
}
