package main;

public class Fizz {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(calc(i));
		}
		
		
	}
	
	public static String calc(int number) {
		StringBuilder sb = new StringBuilder();
		if (number % 3 == 0) {
			sb.append("Fizz");
		}
		if (number%5 == 0) {
			sb.append("Buzz");
		}	
		
		if (sb.length() == 0) {
			sb.append(number);
		}
		
		return sb.toString();
		
	}
	
}
