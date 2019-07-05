package model.domain;

public class Student {
	private String name;
	private float midTerm;
	private float finalTerm;
	public Student() {
		super();
	}
	public Student(String name, float midTerm, float finalTerm) {
		super();
		this.name = name;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSocre(float midTerm, float finalTerm) {
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	public String toString() {
		return "Student [name=" + name + ", midTerm=" + midTerm + ", finalTerm=" + finalTerm + "]";
	}

}
