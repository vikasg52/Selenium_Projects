import java.util.ArrayList;

public class ArrayListExample {
	// can accept duplicate values
	// ArraList,LinkedList,vector- Implementing List interface
	// array have fixed size where as arraylist can grow dynamically
	// you can access and insert any value in any index
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Santosh");
		a.add("Sandeep");
		a.add("Sandeep");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Sandeep"));
		System.out.println(a.indexOf("Sandeep"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
