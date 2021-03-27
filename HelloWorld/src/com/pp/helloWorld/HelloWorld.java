package com.pp.helloWorld;

public class HelloWorld {
	public static void main(String[] arge) {
		// Lab1 "Comment"
		// 1.1 Variables here
		String str = "Petchi";
		int num = 50;
		boolean myBool = true;

		/*
		 * 1.2 Below this is my printing line.
		 */
		System.out.println("Hello world");
		System.out.println("This is String " + str);
		System.out.println("This is Integer " + num);
		System.out.println("This is Boolean " + myBool);
		// Homework
		System.out.println("//////////LAB2/////////////");
		bark();
		System.out.println("//////////LAB3/////////////");
		lab3();
		System.out.println("//////////LAB4/////////////");
		lab4();
		System.out.println("//////////LAB5/////////////");
		lab5();
		System.out.println("//////////LAB6/////////////");
		lab6();
		System.out.println("//////////LAB7/////////////");
		lab7();
		System.out.println("//////////LAB8/////////////");
		lab8();
		System.out.println("//////////LAB9/////////////");
		lab9();
		System.out.println("//////////LAB10/////////////");
		lab10();
		System.out.println("//////////LAB11/////////////");
		lab11();
		System.out.println(welcome("Petchi"));
	}

	// Lab2 "Bark"
	public static void bark() {
		// 2.1
		String dogName = "Mabmab";
		System.out.println("The Dog name = " + dogName);

		// 2.2
		float maFloat = 5.55555f;
		int maInt = 111;
		int toInt = (int) maFloat;
		float toFloat = maInt;
		double toDouble = maFloat;
		char maChar = (char) maInt;

		System.out.println("Float -> Int = " + toInt);
		System.out.println("Int -> Float = " + toFloat);
		System.out.println("Double -> Float = " + toDouble);
		System.out.println("Char -> Int = " + maChar);

		// 2.3 This code will error if change hello variable
		final String hello = "Hello";
//		hello = "World";
		System.out.println(hello);
	}

	// Lab3
	public static void lab3() {
		// 3.1
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("This is 'i' variable that plus 5 times. The value is = " + i);
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println("This is 'i' variable that minus 5 times. The value is = " + i);

		// 3.2 + 3.3
		float testFloat = 12.3f;
		char testChar = 11011;

		if ((testFloat == 12.3f) && (testFloat > 1))
			System.out.println("Yes the float is 12.3.");
		if ((testChar == 11011) || (testChar == 2))
			System.out.println("Test 'or' with char variable success.");
	}

	// lab4
	// 4.1
	public static void lab4() {
		int score = 79;
		if (score < 50) {
			System.out.println("fail");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score >= 80) {
			System.out.println("Good");
		}

		// 4.2
		score = 15;
		boolean isHandSome = true;
		if (isHandSome == true) {
			System.out.println("Good");
		} else if (score < 50) {
			System.out.println("fail");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score >= 80) {
			System.out.println("Good");
		}
	}

	// lab5
	public static void lab5() {
		int score1 = 12;
		String gpa = "";
		switch (score1) {
		case 40:
			gpa = "Grade = F";
			break;
		case 50:
			gpa = "Grade = D";
			break;
		case 60:
			gpa = "Grade = C";
			break;
		case 70:
			gpa = "Grade = B";
			break;
		case 80:
			gpa = "Grade = A";
			break;
		default:
			gpa = "Grade = E";
			break;
		}
		System.out.println(gpa);
	}

	// lab6
	public static void lab6() {
		// 6.1
		int i = 0;
		while (i <= 10) {
			System.out.println("This is while loop " + i);
			i++;
		}

		// 6.2
		int num = 0;
		for (int sum = 1; sum <= 10; sum++) {
			num += sum;
			System.out.println("This is sum from 1 to 10 = " + num);
		}

		// 6.3
		for (int x = 1; x <= 100; x++) {
			if (x % 12 == 0) {
				System.out.println("This number can devide by '12' = " + x);
			}
		}

		// 6.4
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int x : arr) {
			System.out.println("Item in the array is " + x);
		}
	}

	// lab7
	public static void lab7() {
		int num = 20;
		do {
			System.out.println("This is even number = " + num);
			num--;
		} while (num % 2 == 0);
	}

	// lab8
	public static void lab8() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11)
				break;
			System.out.println("Counting '" + count + "', will BREAK at 11.");
		}
	}

	// lab9
	public static void lab9() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11)
				System.out.println("Continue to show only " + count);
			continue;
		}
	}

	// lab10
	public static void lab10() {
		for (int count = 0; count <= 10; count++) {
			if (count == 2)
				continue;
			System.out.println("Counting " + count + " to 10 except '2'.");
		}
	}

	// lab11
	public static void lab11() {
		System.out.println("This is a mathod that will not return value.");
	}

	public static String welcome(String name) {
		return "Welcome to code camp Mr." + name;
	}
}
