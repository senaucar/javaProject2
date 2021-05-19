package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("senauçar", 1 , "sbhfsg@gmail.com", "java+react");
		Student student2 = new Student("ali veli", 2 , "hgfh@gmail.com","C#+Angular");
		
		Instructor instructor1 = new Instructor("engin demiroğ", 10, "kdfk@gmail.com","new course");
	
		UserManager userManager = new UserManager();
		User[] users = {student1, student2, instructor1};
		userManager.addMultiple(users);
		
		System.out.println();
		System.out.println("--------------------");
		StudentManager studentManager = new StudentManager();
		studentManager.print(student1);
		studentManager.print(student2);
		
		System.out.println();
		System.out.println("---------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.print(instructor1);
		
	}

}
