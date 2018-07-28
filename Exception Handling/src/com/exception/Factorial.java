package com.exception;

@SuppressWarnings("serial")
class FactorialException extends Exception {
	public FactorialException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidInputException extends Exception {
	public InvalidInputException(String message) {
		super(message);
	}
}

public class Factorial {
	

	int getFactorial(int number) throws InvalidInputException, FactorialException {
		if (number < 2)
			throw new InvalidInputException("Number cannot be less than 2");
		while(number>2) {
			if(number>2)
				return number*getFactorial(number - 1);
			else
				return 2;
		}
		if (number > Integer.MAX_VALUE)
			throw new FactorialException("Factorial cannot be more than 2,147,483,647");
		return number;
	}
	
	int displayLargestInt() {
		return 0;
	}
}