package program;

public class EvenPosition {

	public static void main(String[] args) {
		String str = "Santosh";
		for (int i = 1; i < str.length(); i = i + 2) {
			System.out.println(str.charAt(i));
		}
//With Array:
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i < str.length(); i = i + 2) {
			System.out.println(arr[i]);
		}

	}
}
