package step03;

public class Ex01Static {
	static String name;
	static char id= 't';		
	static int age = 10;
	
	
	public static void main(String[] args) {
		name = "encore";
		System.out.println(id + " " + age + " " + name); //t 10 encore

	}

}
