package step02.review;

public class Test30704 {
	static String m1() {
		String v = "������";
		return v;
	}
	static void m2(String v) {
		System.out.println(2 + " " + v);
	}
	public static void main(String[] args) {
		String v = m1();
		System.out.println(1 + " " + v);
		v = "������";
		m2(v);
		System.out.println(3 + " " + v);
	}
}
