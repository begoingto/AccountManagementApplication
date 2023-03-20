/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Account{
    int id;
    String ownerName;
    double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
public class Main {
    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1 . descending order by account_id
    // 2.  ascending order by account_id
    // 3. descendinder order by balance
    public static void main(String[] args) {

        int option;
        List<Account> accountList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add account:");
            System.out.println("2: Remove Account: ");
            System.out.println("3. Edit Account ");
            System.out.println("4. Show account infor");
            System.out.println("5. Exit ");
            System.out.println("Choose option ( 1 - 5 ) : ");
            option  = input.nextInt();

            switch (option){
                case  1 :
                    // enter account information
                    // object add list
                    //accountList.add();
                    System.out.println("Enter your account infor");
                    Account acc = new Account();
                    System.out.print("Input ID:");
                    acc.id = input.nextInt();
                    System.out.print("Name:");
                    input.nextLine();
                    acc.ownerName = input.nextLine();
                    System.out.print("Balance:");
                    acc.balance = input.nextInt();

                    accountList.add(acc);
                    //Iterator<String> i = accountList.iterator();

                    break;
                case 2 : break;
                case 3 : break;
                case 4 :
                    int showOption ;
                    System.out.println("Show account nformation");
                    System.out.println("1. Ascending order (by ID )");
                    System.out.println("2. Descending order (by ID) ");
                    System.out.println("3. Descendig order by balance ");

                    System.out.println("Choose show option : ");
                    showOption =  input.nextInt();
                    switch (showOption){
                        case 1:
                            for (Account account1: accountList
                            ) {
                                System.out.println(account1);
                            }
                    }
                    break;
                case 5 :
                    System.out.println("Exit the program....!");break;

            }
        }while(option  !=5);

    }
}*/