package model.domain;

public class People {
	private String name;
	private int age;
	public People() {}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
		else
			System.out.println("값이 무효합니다.");
	}
	
	public String toString() {
		return name + " " + age;
	}
}


