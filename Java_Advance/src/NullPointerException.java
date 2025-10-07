import java.util.Optional;

public class NullPointerException {

	
	
	public static void main(String[] args) {
		
		Optional< String > name = Optional.ofNullable(null);
		
		System.out.println(name.orElse("Default Name "));
		
		
	}
}
