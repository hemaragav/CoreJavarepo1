package Week3.Assignment;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		int[] array = { 3, 2, 11, 4, 6, 7 };

		System.out.println("From the last to second number is:");

		for (int i = 0; i < array.length; i++) {

			if (array[i] == array[array.length - 2]) {
				System.out.println(array[i]);
			}

		}
	}

}
