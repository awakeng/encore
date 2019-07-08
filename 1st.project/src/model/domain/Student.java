package model.domain;

public class Student {
	private String name;
	private float midTerm;
	private float finalTerm;
	private float avg;
	public Student() {}
	public Student(String name, float midTerm, float finalTerm) {
		this.name = name;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		avg = (this.midTerm + this.finalTerm)/2;
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
	public float getAvg() {
		return avg;
	}
	public String toString() {
		return "Student [name=" + name + ", midTerm=" + midTerm + ", finalTerm=" + finalTerm + "]";
	}

}
