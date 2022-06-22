package pl.coderslab.darrays;

public class Main04 {

	public static void main(String[] args) {

		int[] numbers = {4, 643, 112, 9999, 69};
		int sumOdd = 0;
		for (int i = 0; i < numbers.length; i++) {
			boolean parzysta = (numbers[i] % 2) == 0;
			if (parzysta) {
				System.out.println(numbers[i]);
			} else {
				sumOdd = sumOdd + numbers[i];
			}
		}
		System.out.println("SUMA: " + sumOdd);

	}

}
