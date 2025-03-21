public class BankAccountRunner {
    public static void main(String[] args) {
        System.out.print("main method started");
        BankAccount.getBalance();
        BankAccount.credit(600.00);
        BankAccount.getBalance();
        BankAccount.debit(600.00);
        BankAccount.getBalance();
        System.out.println("main method ended");
        
    }

    
}
