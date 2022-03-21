package a3;

public class UserRegistration {
	public void registerUser(String username,String userCountry)
			throws InvalidCompanyException {
		if(userCountry.equals("india")) {
			System.out.println("successful registration of user");
		}else
			throw new InvalidCompanyException("invalid country name : "+
		userCountry+" please provide india");
	}

}
