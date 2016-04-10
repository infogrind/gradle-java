package ch.hotstuff.gradletest;

public class StringStuff {
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
