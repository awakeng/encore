package step04.pattern;

public class Test {

	public static void main(String[] args) {
		//���ε� admin�ξ� �α��� �õ��ϴ� ��Ȳ�̶� ����
		//�ڵ�� filtering
		String admin = "admin";
		String customer = "customer";
		if(!customer.equals("admin")) {
			Admin.loginFail();	
		}
		
	}

}
