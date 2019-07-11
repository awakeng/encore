package step01;

import exception.NotAdminException;

public class ExceptionTest3 {
	/* id�� ����. ��, admin�� �ƴ� ���, NotAdminException �߻�
	 * ����� �� 1 : ���� - admin�� ���
	 * ����� �� 2 : ������ - admin�� �ƴ� ���
	 * 			NotAdminException �߻�(��ü �����ؼ� thorw)
	 */
	
	public static void idCheck(String id) throws NotAdminException {
		if(!id.equals("admin")) {
			throw new NotAdminException("admin�� �ƴѵ� ���� �õ� ����");
		}
		System.out.println("admin�� �ȳ��ϼ��� :)");
	}
	
	public static void main(String[] args) {
		// admin ���� ��û
		/* ���� ����� ����� ��
		 * 				1 - ����
		 * 				2 - ������
		 * 					:NotAdminException ��ü�� ���� -> ���� ó�� ���� �ʼ�
		 */
		try {
			idCheck("admin");
		}catch(NotAdminException e) {
			e.printStackTrace();
		}
			
		System.out.println("-------------------------");
		try {
			idCheck("admin�ƴϴ�");
		}catch(NotAdminException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
//		System.out.println("I'm fine");
	}

}
