import java.util.*;

public class AccountManagementApplication {
    public List<UserAccount> users;
    public int option;
    private UserAccount userAccount;
    public final Scanner input = new Scanner(System.in);
    public AccountManagementApplication(){
        UserAccount user1 = new UserAccount(1,"A Jonh",15.0);
        UserAccount user2 = new UserAccount(2,"C Smith",50.50);
        UserAccount user3 = new UserAccount(3,"B Long",100.50);
        this.users = new ArrayList<>(Arrays.asList(user1,user2,user3));
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
        user.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Name: ");
        user.name = input.nextLine();
        System.out.print("Enter Balance: ");
        user.balance = Double.parseDouble(input.nextLine());
        this.findUser(user.id);
        if (this.userAccount != null){
            this.messageError("Wrong user id already exist.");
            return;
        }
        users.add(user);
        System.out.println("************************************");
        System.out.println("* User "+ user.name +" have added successfully.");
        System.out.println("************************************");
        System.out.print("Please enter to continue...");
        input.nextLine();
    }

    public void showAccounts(){
        System.out.println("***************** All user Account *****************");
        int option;
        do {
            System.out.println("ID\t\t Name\t\t Balance");
            for (UserAccount user: users){
                System.out.println(user.id+"\t\t"+user.name+"\t\t"+user.balance);
            }
            System.out.print("=> Confirm 1 for continue show and sort OR 0 for exit show: ");
            option = input.nextInt();
            if (option!=1){
                break;
            }
            input.nextLine();
            System.out.print("=> Enter Column(id,name,balance) to sort : ");
            String key = input.nextLine();
            System.out.print("=> Enter sort direct ASC or DESC:");
            String direct = input.nextLine();
            if (direct.equalsIgnoreCase("asc")){
                this.sortAsc(key.toLowerCase());
            }else {
                this.sortDesc(key.toLowerCase());
            }
        }while (option==1);
        System.out.print("Please enter to continue...");
        input.nextLine();
    }

    public void findUser(Integer id){
        var user =  users.stream()
                .filter(item -> Objects.equals(item.id, id))
                .findAny()
                .orElse(null);
        if (user == null){
            return;
        }
        userAccount = user;
    }

    public void editUser(Integer id){
        this.findUser(id);
        if (userAccount == null){
            this.messageError("User List is empty!!!");
            input.nextLine();
            return;
        }
        System.out.println("##########################################################");
        System.out.println("ID :"+ userAccount.id + " \t\t Name: "+ userAccount.name + "\t\t Balance: "+ userAccount.balance);
        System.out.println("##########################################################");
        System.out.println("=> ID: "+ userAccount.id);
        input.nextLine();
        System.out.print("=> Update Name: ");
        userAccount.name = input.nextLine();
        System.out.print("=> Update Balance: ");
        userAccount.balance = Double.parseDouble(input.nextLine());
        // set new update value
        users.set(users.indexOf(userAccount), userAccount);
        System.out.println("************************************");
        System.out.println("* User have updated successfully.");
        System.out.println("************************************");
        System.out.print("Please enter to continue...");
        input.nextLine();
        userAccount = null;
    }

    public void removeUser(Integer index)
    {
        this.findUser(index);
        if (userAccount == null){
            this.messageError("User List is empty!!!");
            input.nextLine();
            return;
        }
        users.remove(this.userAccount);
        System.out.println("************************************");
        System.out.println("* User have deleted successfully.");
        System.out.println("************************************");
        userAccount = null;
    }

    public void messageError(String message){
        System.out.println("------------------------------------");
        System.out.println("- \t " + message);
        System.out.println("------------------------------------");
        System.out.print("Please enter to continue...");
        input.nextLine();
    }


    private void sortAsc(String key){
        if ( key.equals("name")){
            this.users.sort((o1, o2) -> (o1.name.compareTo(o2.name)));
        }
        if (key.equals("balance")){
            this.users.sort((o1, o2) -> (o1.balance.compareTo(o2.balance)));
        }
        if ( key.equals("id")){
            this.users.sort((o1, o2) -> (o1.id.compareTo(o2.id)));
        }
    }

    private void sortDesc(String key){
        if ( key.equals("name")){
            this.users.sort((o1, o2) -> (o2.name.compareTo(o1.name)));
        }
        if (key.equals("balance")){
            this.users.sort((o1, o2) -> (o2.balance.compareTo(o1.balance)));
        }
        if ( key.equals("id")){
            this.users.sort((o1, o2) -> (o2.id.compareTo(o1.id)));
        }
    }
}
