
public class Employee {
	private String userName;
	private String password;
	private String firstName;
	private boolean loggedIn;
	public static final int LENGTH_ACCOUNT = 8;
	public static final int MAXLENGTH_PASSWORD = 16;
    public static final int MINLENGTH_PASSWORD = 8;
    public static char[] badChars = {' ', ',', '/', '\\', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
    public static char[] spaces = {' '};
    
    public static boolean checkAccountLength(String argAccountNumber){
        if(argAccountNumber.length() <= LENGTH_ACCOUNT){
            return true;
        }else{
        	System.out.println("Employee account information does not satisfy length requirement");
            return false;
        }
    }
    public static boolean checkAccountForBadCharacters(String argAccountNumber){
        //returns true if bad characters / control characters are PRESENT the incoming String
        //otherwise returns false
        for(char c : badChars){
            if(argAccountNumber.indexOf(c) >= 0){
            	System.out.println("The employee account username has a special character in it");
                return false;
            }
        }
        return true;
    }
    public static boolean checkPasswordLength(String password){
        if(password.length() <= MAXLENGTH_PASSWORD && password.length() >= MINLENGTH_PASSWORD){
            return true;
        }else{
        	System.out.println("Password does not satisfy length requirement");
            return false;
        }
    }
    public static boolean checkPasswordForBadCharacters(String password){
        for(char c : spaces){
            if(password.indexOf(c) < 0){
                return true;
            }
        }
        System.out.println("The employee account password has a special character in it");
		return false;
    }
	public Employee() {
 }
	public Employee (String un, String pass) throws Throwable
	{
		if (checkAccountLength(un) && checkAccountForBadCharacters(un) && checkPasswordLength(pass) && checkPasswordForBadCharacters(pass))
		{
    		userName = un;
			password = pass;
			//firstName = fn;
			loggedIn = false;
		}
		else
		{
			this.finalize();
		}
	}

	public String getName()
	{
		return firstName;
	}
	public String getPassword()
	{
	    return password;
         }
	public String getUser()
	{
		return userName;
	}
	public void printMsg() {
	    System.out.println("Welcome" + userName);
 }
	public void setUserName(String newUserName) {
	    this.userName = newUserName;
 }
        public void setPassword(String newPassword) {
	    this.password = newPassword;
 }
	public boolean login(String user, String pass)
	{
		if (user == userName)
		{
			if (pass == password)
			{
				loggedIn = true;
				return true;
			}
		}
		return false;
	}
	
	public void logout()
	{
		loggedIn = false;
	}
	
}