package notizen;

import java.util.Scanner;

public class Not_250424 {
	
	// protected static final int secretNumber = 0;
		// secret items

		public static void main(String[] args) {
			System.out.println("Du betrittst eine Höhle");
			System.out.println("A) Umkehren");
			System.out.println("B) So ein Feuerball, Junge");
			System.out.println("C) Wände abtasten");

			// text based variables
			// syso for system.out

			// non primitive data types
			String thisIsAText;
			Integer number;
			Scanner scanner;
			String[] wordsArray = { "cave", "torch", "scary shadow" };
			System.out.println(wordsArray.length);

			String textObject = new String("Ich bin ein Stringobjekt");
			// create objects with "new"

			System.out.println("String Buchstabe aus Objekt:");
			System.out.println(textObject.charAt(5));

			// camel case

			thisIsAText = "I'm a string now";

			String thisIsAlsoText = "I'm also a string";

			System.out.println(thisIsAText);
			System.out.println(thisIsAlsoText);

			// primitive data types

			char letter = 'A';

//		numerical values
			byte smallNumber = 127; // max num
			short mediumNumber = 32767; // max num
			int number1 = 6;
			float decimalNumber = 3.1f;
			double preciseNumber = 3.14159;

	// float rarely used, use double instead

	// true false

			boolean isThisTrue = true;
			if (isThisTrue)
				;

}
}
