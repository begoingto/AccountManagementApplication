import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccountManagementApplication {
    public List<UserAccount> users;
    public int option;
    public final Scanner input = new Scanner(System.in);

    public AccountManagementApplication(){
        this.users = new ArrayList<>();
    }
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount(1,"Jonh",15.0);
        UserAccount user2 = new UserAccount(2,"Smith",50.50);
        UserAccount user3 = new UserAccount(3,"Long",100.50);
        ArrayList<UserAccount> users = new ArrayList<>(Arrays.asList(user1,user2,user3));

        // show Items
        for (UserAccount user : users) {
            System.out.println(user.toString());
        }
        // sort
    }

    public void getStart()
    {
        System.out.println("******** Please choose Option *******");
        System.out.println("1: Add account:");
        System.out.println("2: Remove Account: ");
        System.out.println("3. Edit Account ");
        System.out.println("4. Show account Information");
        System.out.println("5. Exit ");
        System.out.print("Choose option ( 1 - 5 ) : ");
        option  =  input.nextInt();
    }

    public void exit(){
        System.exit(0);
    }

    public void addAccount(){
        System.out.println("**** Form account information ********");
        UserAccount user = new UserAccount();
        System.out.print("Enter ID: ");
        user.id = Integer.parseInt(input.nextLine());
        input.nextLine();
        System.out.print("Enter Name: ");
        user.name = input.nextLine();
        System.out.print("Enter Balance: ");
        user.balance = Double.parseDouble(input.nextLine());
        users.add(user);
        System.out.println( "User : "+this.users);
        System.out.println("************************************");
        System.out.println("* User "+ user.name +" have added successfully.");
        System.out.println("************************************");
        System.out.print("Please enter to continue...");
        input.nextLine();
    }

    public void showAccounts(){
        System.out.println("***************** All user Account *****************");
        System.out.println("ID\t\t Name\t\t Balance");
        for (UserAccount user: users){
            System.out.println(user.id+"\t\t"+user.name+"\t\t"+user.balance);
        }
        System.out.print("Please enter to continue...");
        input.nextLine();
        input.nextLine();
    }



    public void messageError(){
        System.out.println("------------------------------------");
        System.out.println("- \t The Application is Error!!!");
        System.out.println("------------------------------------");
    }

}
