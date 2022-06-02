package program;

import java.util.LinkedHashSet;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 1 };
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (hs.add(num) == true) {
				System.out.print(num + " ");
			}
		}

	}

}
