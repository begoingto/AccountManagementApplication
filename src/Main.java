public class Main {
    public static void main(String[] args) {
        AccountManagementApplication application = new AccountManagementApplication();
        do {
            application.getStart();
            switch (application.option){
                case 1:
                    application.addAccount();
                    break;
                case 2:
                    System.out.println("******** Delete User Account ***********");
                    System.out.print("=> Enter user id to delete : ");
                    Integer deleteId = application.input.nextInt();
                    application.removeUser(deleteId);
                    break;
                case 3:
                    System.out.println("******** Edit User information ***********");
                    System.out.print("=> Enter user id to Edit: ");
                    Integer editId = application.input.nextInt();
                    application.editUser(editId);
                    break;
                case 4:
                    application.showAccounts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    application.messageError("The Application is Error!!!");
                    application.getStart();
            }
        }while (application.option != 5);
    }
}
