import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "GoodBye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		hm.put(3, "afternoon");
		System.out.println(hm);
		System.out.println(hm.get(2));
	}

}
