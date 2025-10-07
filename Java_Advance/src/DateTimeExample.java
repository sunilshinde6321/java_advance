import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime datetime = LocalDateTime.now();
		
		
		
		System.out.println(today);
		System.out.println(time);
		System.out.println(datetime);
		
	}
}
