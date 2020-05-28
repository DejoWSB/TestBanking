package banking;

public class Account {
    private double balance;

    public Account(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

 //   public void deposit(double amount) {
        public boolean deposit(double amount)
        {
            balance = balance + amount;
            return true;
        }
 //       public void withdraw(double amount)
 //       {
 //           balance = balance - amount;
            public boolean withdraw ( double amount)
            {
                boolean result = true;
  //              System.out.println(result);
                if (balance < amount) {
                    result = false;
                } else {
                    balance = balance - amount;
                }
                return result;
            }
  //      }
}