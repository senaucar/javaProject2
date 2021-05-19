package odev2;

public class Instructor extends User{

	private String givenCourses;

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	
	public Instructor(String name, int id, String email, String givenCourse) {
		super(name,email,id);
		this.setGivenCourses(givenCourses);
	}
	
}
