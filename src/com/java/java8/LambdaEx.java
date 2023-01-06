package src.com.java.java8;

interface MathOperation {
	int operation(int a, int b);
}

interface GreetingService {
	void sayMessage(String message);
}

//parameter -> expression body
public class LambdaEx {
	public static void main(String[] args) {

		LambdaEx result = new LambdaEx();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declarion
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces

		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// with out return statement and without currly braces

		MathOperation division = (a, b) -> a / b;

		System.out.println("addition operation= " + result.operate(10, 5, addition));
		System.out.println("subtraction operation= " + result.operate(90, 80, subtraction));
		System.out.println("Division Operation " + result.operate(10, 2, division));
		System.out.println("Multiplication Operation " + result.operate(12, 12, multiplication));

		// without parenthesis
		GreetingService greetService1 = mesage -> System.out.println("hello" + mesage);

         //with paranthesis
		GreetingService greetingService2 = (message) -> System.out.println("Hi" + message);

		greetingService2.sayMessage("Nagendar");
		greetService1.sayMessage("Shreyansh");
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);

	}
}