package step04.pattern;

public class Admin {
	static Log4J log = Log4J.getInstance();
	
	//������ �����ڰ� admin�̶�� id������ login�� ȣ��Ǵ� �޼ҵ�� ����
	//���� �����̶� ����
	public static void login() {
		System.out.println(log.info());
		//..
	}
	//�����ڰ� �ƴԿ��� ���� ������ó�� �α��� �õ��� ����Ǵ� �޼ҵ�� ����
	public static void loginFail() {
		System.out.println(log.warn());
		//..
	}
	//?....
	
}
