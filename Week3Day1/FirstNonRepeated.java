package Week3Day1;

public class FirstNonRepeated {
	
	public static void main(String[] args) {
		
		String input = "Java articles are awesome";
		
		Character result = input.chars().mapToObj(c -> (char) c)
							.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
							.findFirst().orElse(null);
		
		System.out.println(result);
	}
}
