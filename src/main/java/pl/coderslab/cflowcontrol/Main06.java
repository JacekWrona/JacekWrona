package pl.coderslab.cflowcontrol;

public class Main06 {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i <= n; i = i+1) {
			System.out.print(i + " - ");
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

		int i = 0;
		while (i <= n) {
			System.out.print(i + " - ");
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			i++;
		}
	}

}
