package com.formation.example6;

public class Test6 {

	public static void main(String[] args) {
		String mot1 = "kayak"; // equivalent a String mot1 = new String("kayak");
		StringBuffer sb = new StringBuffer(mot1);

		sb.reverse();  // equivalent StringBuffer sb = new StringBuffer(mot1).reverse();
		String inverse = sb.toString();
//		System.out.println(sb);
//		System.out.println(sb.reverse());
//		System.out.println(inverse);

		if (mot1.equals(inverse)) {
			System.out.println("C'est un palindrome");
		} else {
			System.out.println("Ce n'est pas un palindrome");
		}
	}
}
