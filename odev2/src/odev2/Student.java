package odev2;

public class Student extends User{
	private String takenCourses;

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	public Student(String name, String email,int id, String takenCourses) {
		super(name,email,id);
		this.setTakenCourses(takenCourses);
	}
}
