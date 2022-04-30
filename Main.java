import java.util.Scanner;
public class Main {
    public void printInstruction()
    {
        System.out.println("Please enter option: ");
        System.out.println("1. Create user account");
        System.out.println("2. User login");
        System.out.println("3. Create employee account");
        System.out.println("4. Employee login");
    }
    public static void main(String[] args){
            int choice;
            String user;
            String password;
            String food;
        
            Scanner keyboard = new Scanner(System.in);
            Account acc1 = new Account();
            Employee emp = new Employee();
            Main main = new Main();
            Order order = new Order();
            DBTest db = new DBTest();
                while(true){
                //DBTest db = new DBTest();
                main.printInstruction();
                choice = keyboard.nextInt();                
                switch(choice){
                case 1:
                System.out.print("Enter your username: ");
                user = keyboard.next();
                acc1.setUserName(user);
                System.out.print("Enter your password: ");
                password = keyboard.next();
                acc1.setPassword(password);
                break;
                case 2:
                System.out.print("Enter your username: ");
                String Luser = keyboard.next();
                System.out.print("Enter your password: ");
                String Lpassword = keyboard.next();
                if(Luser.equals(acc1.getUser()) && Lpassword.equals(acc1.getPassword())){
                    System.out.println("Welcome " + acc1.getUser() + "!");
                    db.msg();
                    food = keyboard.next();
                    boolean ans = db.isFood(food);
                    if(ans){
                    order.setFood(food);
                    System.out.println(order.send());}
                    else{
                    System.out.println("Invalid food");
                }
                }
                    else{
                    System.out.println("Incorrect username or password");
                }
                case 3:
                System.out.print("Enter your username: ");
                user = keyboard.next();
                emp.setUserName(user);
                System.out.print("Enter your password: ");
                password = keyboard.next();
                emp.setPassword(password);
                break;
                case 4:
                System.out.print("Enter your username: ");
                String Lemployee = keyboard.next();
                System.out.print("Enter your password: ");
                String Lpass = keyboard.next();
                if(Lemployee.equals(emp.getUser()) && Lpass.equals(emp.getPassword())){
                    System.out.println("Welcome " + emp.getUser() + "!");
                    System.out.println("You have successfully logged in as an employee.");
                }
                else{
                    System.out.println("Incorrect username or password");
                    }	
                break;
                case 0:
                return;
                }
            }
    }        
}

