import static java.lang.System.out;
public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = "Barry";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;
        yourAccount.name = "Jane";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;
        myAccount.display();
        out.print (" plus $");
        out.print(myAccount.getInterest(5.00));
        out.print(" dohoda ");
        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print (" plus $");
        double yourInterestAmount =
                yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.print(" dohoda ");
    }
}
