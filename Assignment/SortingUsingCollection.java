package Week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String array[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> list = new ArrayList<>(Arrays.asList(array));

		Collections.sort(list);
		System.out.println("The Sorted order of the list :");
		System.out.println(list);
		System.out.println("The reverse order of the list :");

		for (int i = list.size()-1; i >= 0; i--) {

			
			System.out.println(list.get(i));
		}
	}

}
