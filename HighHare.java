import java.util.*;
public class HighHare extends Mammal {
	int rating;
	public HighHare() {
		super();
		Random gen = new Random();
		rating = 1 + gen.nextInt(10);
	}
	public int pinache() {
		int chiefkeef = rating;
		String ay = "du";
		while(chiefkeef >= 0){
			ay += "u";
		}
		ay += "de";
		System.out.println(ay + "I'm so high right now man");
		return rating;
	}
}