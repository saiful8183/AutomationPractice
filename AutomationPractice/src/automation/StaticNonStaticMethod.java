package automation;

public class StaticNonStaticMethod {

	public static void main(String[] args) {

		
		
		sum();

		remainder();
		multiplication();

		StaticNonStaticMethod st = new StaticNonStaticMethod();

		st.minus();
		st.divide();
	}

	public static void sum() {

		int a = 10;
		int b = 20;

		int n = a + b;

		System.out.println(n);
	}

	public static void multiplication() {

		int a = 10;
		int b = 20;

		int c = a * b;

		System.out.println(c);

	}

	public static void remainder() {

		int a = 10;
		int b = 20;

		int l = a % b;

		System.out.println(l);

	}

	public void minus() {

		int a = 10;
		int b = 20;

		int k = b - a;

		System.out.println(k);

	}

	public void divide() {

		int a = 3000;
		int b = 2;

		int w = a / b;

		System.out.println(w);

	}

}
