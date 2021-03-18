package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
			*/
		int numberOfExercises;
		numberOfExercises = 26;

		System.out.println("1. numberOfExercises = " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half;
		half = 0.5;
		System.out.println("2. half = " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "TechElevator";
		System.out.println("3. name = " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		byte seasonsOfFirefly = 1;
		
		
		System.out.println("4. seasonsOfFirefly = " + seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println("5. myFavoriteLanguage = " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		float pi = 3.1416f;
		
		System.out.println("6. pi = " + pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Ransom Ward";
		System.out.println("7. myName = " + myName);
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOfButtonsOnMouse = 2;
		
		System.out.println("8. numberOfButtonsOnMouse = " + numberOfButtonsOnMouse);	
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

		double percentageOfBattery = .70;
		System.out.println("9. percentageOfBattery = " + percentageOfBattery);
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int numberDifference = 121 - 27;
		System.out.println("10. numberDifference = " + numberDifference);
		
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double numberAddition = 12.3 + 32.1;
		System.out.println("11. numberAddition = " + numberAddition);
		/*
		12. Create a String that holds your full name.
		*/
		String myFullName = "Ransom Earl Ward";
		System.out.println("12. myFullName = " + myFullName);
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String helloName = "Hello" + myFullName;
		System.out.println("13. " + helloName);
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		myFullName= myFullName + "Esquire";
		System.out.println("14. " + myFullName);
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		myFullName += "Esquire";
		System.out.println("15. "  + myFullName);
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movie = "Saw";
		movie += 2;
		System.out.println("16. " + movie);
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movie += 0;
		System.out.println("17. " + movie);
		/*
		18. What is 4.4 divided by 2.2?
		*/
		double numerator = 4.4;
		double denominator = 2.2;
		double answer = numerator / denominator;
		System.out.println("18. 4.4 / 2.2 = " + answer);
			
		/*
		19. What is 5.4 divided by 2?
		*/
		double numerator2 = 5.4;
		int denominator2 = 2;
		double answer2 = numerator2 / denominator2;
		System.out.println("19. 5.4 / 2 = " + answer2);
		/*
		20. What is 5 divided by 2?
		*/
		int numerator3 = 5;
		double denominator3 = 2;
		double answer3 = numerator3 / denominator3;
		System.out.println("20. 5 / 2 = " + answer3);
		/*
		21. What is 5.0 divided by 2?
		*/
		double numerator4 = 5.0;
		int denominator4 = 2;
		double answer4 = numerator4 / denominator4;
		System.out.println("21. 5.0 / 2 = " + answer4);
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		double numerator5 = 66.6;
		int denominator5 = 100;
		double answer5 = numerator5 / denominator5;
		System.out.println("22. 66.6 / 100 = " + answer);
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int one23 = 5;
		int two23 = 2;
		int division = one23 / two23;
		int remainder = one23 % two23;
		System.out.println("23. " + division + "R"  + remainder);
		/*
		24. What is 1,000,000,000 * 3?
		*/
		long billion = 1000000000;
		long threeBillion = billion * 3l;
		System.out.println("24. Three Billion = "  + threeBillion);
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		/*
		26. Now set doneWithExercise to true.
		*/
		
	}

}
