package jspsample.login;

public class UserValidationService {

	public boolean isUserValid(String user,String password)
	{
		if(user.equals("windsor")&&password.equals("windsor"))
			return true;

		return false;
	}
}
