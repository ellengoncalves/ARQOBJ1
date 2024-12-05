package programa;

public class Main {

	public static void main(String[] args) {
		String s1 = "Hello World!";
		String s2 = "Hello World!";
		String s3 = s1;
		
		// equals
		System.out.println("s1.equals(s2) é " + s1.equals(s2));
		System.out.println("s1.equals(s3) é " + s1.equals(s3));
		
		// ==
		System.out.println("s1 == s2 é " + (s1 == s2));
		System.out.println("s1 == s3 é " + (s1 == s3));
	}

}
