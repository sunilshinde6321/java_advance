public class SwitchExample 
{
	public static void main(String[] args) 
	{
		String day = "MONDAY";
		String type = switch (day) 
				{
				case "SATURDAY", "SUNDAY" -> "Weekend";
				default -> "Weekday";
				};
				System.out.println(type);
	}
}
