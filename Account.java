import java.util.*;

public class Account {
	private String userName;
	private String password;
	private String firstName;
	private boolean loggedIn;
	public static final int LENGTH_ACCOUNT = 8;
        public static char[] badChars = {' ', ',', '/', '\\'};
        private List<String> pastOrders = new ArrayList<String>();
    
    public static boolean checkAccountLength(String argAccountNumber){
        if(argAccountNumber.length() <= LENGTH_ACCOUNT){
            return true;
        }else{
        	System.out.println("Account information does not satisfy length requirement");
            return false;
        }
    }
    public static boolean checkAccountForBadCharacters(String argAccountNumber){
        //returns true if bad characters / control characters are PRESENT the incoming String
        //otherwise returns false
        for(char c : badChars){
            if(argAccountNumber.indexOf(c) >= 0){
            	System.out.println("The account username has special character in it");
                return false;
            }
        }
        return true;
    }
	public Account() {
 }
	public Account (String un, String pass) throws Throwable
	{
		if (checkAccountLength(un) && checkAccountForBadCharacters(un))
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
	
	public void addOrder(String ord)
	{
		
		pastOrders.add(ord);
	}
}