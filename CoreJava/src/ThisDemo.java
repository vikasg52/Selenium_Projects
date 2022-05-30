
public class ThisDemo {
	int a = 2;

	public void getdata() {
		int b = this.a + a;
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisDemo th = new ThisDemo();
		th.getdata();

	}

}
