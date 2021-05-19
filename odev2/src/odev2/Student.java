package odev2;

public class Student extends User{
	private String takenCourses;

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	public Student(String name, int id, String email, String takenCourses) {
		super(name,email,id);
		this.setTakenCourses(takenCourses);
	}
}
