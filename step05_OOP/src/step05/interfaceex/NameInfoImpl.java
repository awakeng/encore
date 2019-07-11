package step05.interfaceex;

public class NameInfoImpl implements NameInfo {

	public static void main(String[] args) {
		//다형성
		NameInfo n = new NameInfoImpl();		// 클래스, 배열, interface 3가지가 참조변수의 Type으로 쓰일 수 있다.
		System.out.println(n.getName());
	}

	@Override
	public String getName() {
		return "김동성";
	}
}
