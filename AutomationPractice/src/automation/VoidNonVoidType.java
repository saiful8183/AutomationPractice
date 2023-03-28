package automation;

public class VoidNonVoidType {

	public static void main(String[] args) {

		Division();// Retuening no value

		int d = Division2(); // Returning value
		String e = name();
	}

	public static void Division() { // Retuening no value

		int a = 5000;
		int b = 20000;

		int c = b / a;

		System.out.println(c);

	}

	public static int Division2() { // Returning value

		int a = 5000;
		int b = 10000;

		int c = b / a;

		System.out.println(c);

		return c;

	}

	public static String name() {

		String s = "Saiful Chowdhury Shohag";
		String a = "Nuyamah Rukayath Manha";
	
		System.out.println(s);
		System.out.println(a);
		return a;

	}

}
