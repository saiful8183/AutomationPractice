package automation;

public class MethodOverloading {

	public static void main(String[] args) {

		// int number1 = 10;
		// int number2 = 20;

		double sum = sum(10, 20);
		System.out.println(sum);
		double sum1 = sum1(200.5, 200.5);
		System.out.println(sum1);
		
		double sum3 = sum3(10, 20,100);
		System.out.println(sum);
		double sum4 = sum4(200.5, 200.5,30.5);
		
		
		
		
		
		
		
		
	}

	public static int sum(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);
		return sum;

	}

	public static double sum1(double num1, double num2) {

		double sum = num1 + num2;
		System.out.println(sum);
		return sum;

	}
	
	
	public static int sum3(int num1, int num2,int num3) {

		int sum = num1 + num2+num3+num3;
		System.out.println(sum);
		return sum;

	}

	public static double sum4(double num1, double num2,double num3) {

		double sum = num1 + num2+num3;
		System.out.println(sum);
		return sum;

	}
	
	
	
	
	
	
	
	
	
	
}
