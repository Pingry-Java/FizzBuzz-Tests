import java.util.ArrayList;
public class Tests {

	public static void main(String[] args) {
		// TOP not inclusive 
		// Negative behavior
		// Behavior with only one
		// when you give it a neg it works but zero does not work as a minimum

		System.out.println("Top is not inclusive as the Readme states");
		System.out.println("generate(1,3): " + FizzBuzz.generate(1,3));
		System.out.println("Negative behavior, generate(-3,0)");
		System.out.println(FizzBuzz.generate(-3,0));
		System.out.println("Weird behavior when you only give it two identical inputs");
		System.out.println("It always returns [1] ie generate(9,9)");
		System.out.println(FizzBuzz.generate(9,9));
		System.out.println("The only correct result from this program is when you give it");
		System.out.println("generate(1,1)");
		System.out.println("Zero does not work as a minimum ie generate(0,3)");
		System.out.println(FizzBuzz.generate(0,3));
		System.out.println("comparison generate(-1,3)");
		System.out.println(FizzBuzz.generate(-1,3));	
	}

}
