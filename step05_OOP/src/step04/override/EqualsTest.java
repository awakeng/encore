/* �н�����
 * 1. ����
 * 	1. ���� 
 * 		1. �ּҰ� 
 * 			- ������ ��ü
 * 			- == 
 * 		2. ��ü ���� ���밪
 * 			- Ÿ�Ը� ������ ��� �ٸ� ��ü�� �ϴ��� �����ϰ� �ִ� �����Ͱ� ���������� ��
 * 			- equals()
 *  
 *  2. �⺻ Ÿ�� ������
 *  	- ==
 *  
 *  3. String�� equals()
 *  	- Object Ŭ������ �ּҰ� �� ������ �����Ǹ��ؼ� ���� �ٸ� ��ü�̱� �ϳ� ���븸 �����ϴٸ� true
 *  
 *  4. java.lang.Object�� equals()
 *  	- public boolean equals(Object o){
 *  		��ü�� �ּҰ� ��
 *  	  }
 *  5. java.lang.String �Ǵ� �ټ��� ���� Ŭ�������� equals()
 *  	- ������ 
 *  	- public boolean equals(Object o){
 *  		������ Ÿ���� ��� ���� �ٸ� ��ü�� �ϴ��� ��ü�� ���������(������) �񱳽� true or false
 *  	  }
 */
package step04.override;
class PersonParent extends Object {
	String name;
}

public class EqualsTest {

	public static void main(String[] args) {
		PersonParent p1 = new Person("����", 25);
		Person p2 = new Person("����", 25);
		System.out.println(p2.equals(p1));//true�� ��µǰ� equals �޼ҵ� ������ �ϱ�
	}
}
class Person extends PersonParent {
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* equals() ������
	 * 1. Person Ÿ�Կ� ���ؼ� - instanceof
	 * 2. ������ Ÿ���� ���  - instanceof
	 * 3. ��� �����鰪 �� - ����Ÿ�� equals()/ �⺻Ÿ�� ==, ��ӹ��� ���� ��� ȣ��� �ݵ�� ����ȯ �ʼ� 
	 * 4. �� �����Ѵٸ�? true
	 *    �ϳ��� �ٸ��ٸ�? false
	 */
	
	public boolean equals(Object obj) {		///Object�� ������ �⺻ Ÿ�� 8���� �����ϰ� �� ���� �� �ִ�.
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if((p.age == age)&&(p.name.equals(name))) {		// name.equals()�̱� ������(���� name�� Ÿ���� String�̱� ������) Object.equals()�� �ƴ϶� String.equals()�̴�.
				return true;
			}
		}
		return false;
	}
}







