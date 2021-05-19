package odev2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getName()+ " sisteme eklendi");
	}
	public void addMultiple(User[] users) {
		for(User user : users) {
			System.out.println(user.getName()+ " sisteme eklendi");
		}
	}
	
	
}
