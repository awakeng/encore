package step05.interfaceex;

public interface NameInfo {
	//ȸ����� ���
	public static final String COMPANY_NAME = "encore";

	//public static final �ڵ� �ݿ� (interface������ �ڵ����� �ݿ��ȴ�!! -> ���ó�� �ȴ�.)
	int HISTORY = 20;
	
	
	//ȸ�翡 �����ϴ� �������� ��ȯ�ϴ� �޼ҵ�, ������ �ʼ�, �� �̸� ��ȯ
	public abstract String getName();
}

