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

                    break;
                case 3:

                    break;
                case 4:
                    application.showAccounts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    application.messageError();
                    application.getStart();
            }
        }while (application.option != 5);
    }
}
