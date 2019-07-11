package step01;

public class ExceptionTest2 {

	public static void main(String[] args) throws ReflectiveOperationException, ClassNotFoundException {
		/*  class ��ġ�� class�� ������ jre�� byte code�� �ε�
		 *  API �����ؼ� �����ϴ� API ������ ���� - ���� �߻� ������ ����� ��
		 *  1. ���� ����
		 *  	- byte code�� �޸𸮿� �ε� �Ϸ�
		 *  2. ������ ����
		 *  	- �� �����ϴ� class���� �߸� parameter ������ �ο�
		 *  	- api ����ڿ��� ������ �̷��� ���� �� ������ ���� ������ ����� �� ó���ϰ��� ����
		 *  		: ��� - �����ϴ� ������ ������ �߰��� �ڵ�� ����
		 *  				���� ��°� �����ϰ� �������� ������ �߱� ��Ȳ ����
		 */
//		System.out.println(1);
//		try {
//			Class.forName("step01.NameInfo");
//			System.out.println(2);
//		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
//			System.out.println(3);
//		}
//		System.out.println(4);
		Class.forName("step01.NameInfo");
		System.out.println(2);
	}

}
//NameInfo.class ��� byte code ����
class NameInfo {
	static {
		System.out.println("����ö");
	}
}