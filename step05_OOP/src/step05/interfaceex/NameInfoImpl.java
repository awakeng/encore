package step05.interfaceex;

public class NameInfoImpl implements NameInfo {

	public static void main(String[] args) {
		//������
		NameInfo n = new NameInfoImpl();		// Ŭ����, �迭, interface 3������ ���������� Type���� ���� �� �ִ�.
		System.out.println(n.getName());
	}

	@Override
	public String getName() {
		return "�赿��";
	}
}
