package lombok;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Dongseong Kim");
		p.setAge(26);
		p.setPrivateNo(930326);
		
		System.out.println(p);
	}

}
