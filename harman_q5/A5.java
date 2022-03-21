package a3;

public class A5 {
	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("raj", "usa");
		} catch (InvalidCompanyException e) {
			System.out.println(e.getMessage());
		}
	}

}
