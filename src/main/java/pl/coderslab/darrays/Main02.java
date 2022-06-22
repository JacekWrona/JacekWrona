package pl.coderslab.darrays;

public class Main02 {

	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "berry"};
		System.out.println(fruits[0]);
		int lastElementIdx = fruits.length - 1;
		System.out.println(fruits[lastElementIdx]);
		for (int i = 0; i < fruits.length; i++) {
			System.out.println( fruits[i] );
		}
	}

}
