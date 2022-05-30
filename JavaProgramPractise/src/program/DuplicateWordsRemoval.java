package program;

public class DuplicateWordsRemoval {

	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big black nose";
		int count;
		str = str.toLowerCase();
		String arr[] = str.split(" ");
		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j] = "0"; //Set words[j] to 0 to avoid printing visited word  
				}
			}
			// Displays the duplicate word if count is greater than 1
			if (count > 1 && arr[i] != "0")
				System.out.println(arr[i]);
		}

	}

}
