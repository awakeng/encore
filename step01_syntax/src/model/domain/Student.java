/* �� ���� : �л� ������ ���α׷�
 * 1. �л� �� ���� ������ ǥ��
 * 2. ���ǻ���: �ٸ� �л��� ������ ȥ�� �Ұ�
 * 			- static Ű���� ��� �Ұ�
 * 3. ���
 * 	- �л� ����ŭ ��ü ����
 * 4. �л� ����
 * 	- �̸�, �й� ...
 * 5. ��ȿ�� ����
 */
package model.domain;

public class Student {
	private String name;
	private long privateNo;
	public Student() {}
	public Student(String name, long privateNo) {
		this.name = name;
		this.privateNo = privateNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrivateNo() {
		return privateNo;
	}
	public void setPrivateNo(long privateNo) {
		this.privateNo = privateNo;
	}
	
	// ��� ������ �����ؼ� �ϳ��� ���ڿ��� ��ȯ�ϴ� �޼ҵ� �߰�
	public String toString() {
		return name + " " + privateNo;
	}
}
