package step02.review;

public class Test20704Review {
	static String[] m1() {
		String[] s = {"data1", "data2"};
		return s;
	}
	static void m2(String[] v) {
		System.out.println(3 + " " + v[0]);
	}
	public static void main(String[] args) {
		String[] v = m1();
		v[0] = "������";
		System.out.println(1 + " " + v[0]);
		m2(v);
		System.out.println(2 + " " + v[0]);
	}

}
