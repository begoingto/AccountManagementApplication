public class UserAccount {
    public Integer id;
    public String name;
    public Double balance;
    public UserAccount(){}

    public UserAccount(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void ShowInfo(){
        System.out.println("********* User Information");
        System.out.println("=> User ID: "+ id);
        System.out.println("=> User Name: "+ name);
        System.out.println("=> User Balance: "+ balance);
    }

    @Override
    public String toString() {
        return "ID: "+ id + ", Name: "+ name + ", Balance: "+ balance;
    }
}
