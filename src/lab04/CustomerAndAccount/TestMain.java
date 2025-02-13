package lab04.CustomerAndAccount;
import lab04.CustomerAndAccount.Customer;
import lab04.CustomerAndAccount.Account;
public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1004, "Bris", 'm');
        System.out.println(customer1);

        Account account1 = new Account(2003, customer1, 123.45);
        System.out.println(account1);
        account1.deposit(23.45);
        System.out.println(account1);
        account1.withdraw(46.9);
        System.out.println(account1);
    }
}
