package program;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Selenium Automation";
		String result = "";
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i]+ " ";
		}
		System.out.println(result);
	}

}
