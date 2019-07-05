//singleton design pattern
package step04.pattern;

public class OneInstance {
	private static OneInstance instance = new OneInstance();
	private OneInstance() {};
	
	public static OneInstance getInstance() {
		return instance;
	}
	//�پ��� ����� public �޼ҵ��
}