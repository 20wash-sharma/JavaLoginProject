package modal;

public class LoginService {
	
	public boolean isValid(String userName, String password) {
		boolean isVaild = false;
		
		if("root".equalsIgnoreCase(userName) && "password".equalsIgnoreCase(password)) {
			isVaild = true;
		}
		return isVaild;
	}

}
