public class BankAccount {
    private double balance;
    private String name;
    private int acctNum;


    public BankAccount(double balance, String name, int acctNum) {
        this.balance = balance;
        this.name = name;
        this.acctNum = acctNum;
    }

    public BankAccount() {
    }


    public void deposit(double depositAmount) {

        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawAmount) {
        this.balance -= withdrawAmount;
    }

    @Override
    public String toString() {
        return name + " account balance: " + balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }


    public void transferMoney(BankAccount bankAccount, double amountToTransfer) {
    }
}
