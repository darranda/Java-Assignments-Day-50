import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccount = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello world! Welcome to the bank of Darranda!");


        BankAccount bankAcct1 = new BankAccount(200, "Mary", 1);
        BankAccount bankAcct2 = new BankAccount(500, "Larry", 2);
        BankAccount bankAcct3 = new BankAccount(0, "Leo", 3);

        bankAccount.add(bankAcct1);
        bankAccount.add(bankAcct2);
        bankAccount.add(bankAcct3);

        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1 for Yes");
        System.out.println("2 for No");
        String input = scanner.nextLine();


        String accountNumber = null;
        int accountInformation = 0;
        if (input.equals("1")) {
            System.out.println("Thank you for being a values customer");
            System.out.println("Please enter your account number: ");

        } else if (input.equals("2")) {
            System.out.println("Let's make a new account!");

            System.out.println("What is the name for the account");
            String name = scanner.nextLine();

            System.out.println("What is the beginning balance for the account");
            String accountBalance = scanner.nextLine();



            if (accountInformation > bankAccount.size()) {
                System.out.println("Account doesn't exist");
            } else {
                BankAccount currentAccount = bankAccount.get(accountInformation);

                while (true) {
                    System.out.println("Hello, " + name + "!");
                    System.out.println("Welcome to the main menu, what would you like to do today?");
                    System.out.println(" 1. To Check balance");
                    System.out.println(" 2. To Make a Withdrawal");
                    System.out.println(" 3. To Make a Deposit");
                    System.out.println(" 4. To Make a transfer to another account");
                    System.out.println(" 0. To Exit");
                    String answer = scanner.nextLine();

                    if (answer.equals("1")) {
                        System.out.println(currentAccount.getBalance());

                    } else if (answer.equals("2")) {
                        System.out.println("How much would you like to withdrawal?");
                        String withdrawal = scanner.nextLine();
                        double withdrawalMoney = Double.parseDouble(withdrawal);
                        currentAccount.withdrawal(withdrawalMoney);

                    } else if (answer.equals("3")) {
                        System.out.println("Please enter the amount you would you like to deposit");
                        String inputMoney = scanner.nextLine();
                        double depositMoney = Double.parseDouble(inputMoney);
                        currentAccount.deposit(depositMoney);

                    } else if (answer.equals("4")) {
                        System.out.println("Please enter the account number to transfer to");
                        String accountNumTransfer = scanner.nextLine();
                        int accountInfoTransfer = Integer.parseInt(accountNumTransfer) - 1;

                        if (accountInfoTransfer > bankAccount.size()) {
                            System.out.println("Sorry! That Account doesn't exist");

                        } else {
                            System.out.println("Please enter the amount you want to transfer");
                            String amountOfMoney = scanner.nextLine();
                            double amountToTransfer = Double.parseDouble(amountOfMoney);
                            currentAccount.transferMoney(bankAccount.get(accountInfoTransfer), amountToTransfer);
                            System.out.println("The name on the account is: " + name + " and they have a balance of $"
                                    + currentAccount.getBalance());
                        }

                    } else if (answer.equals("0")) {
                        System.out.println("Thank you for banking with us!");
                        break;

                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            }
        }
    }
}



        /* BankAccount myAccount = new BankAccount(500, "My");
        myAccount.deposit(100);
        System.out.println(myAccount);

        BankAccount Larry = new BankAccount(5000, "Larry's");
        Larry.withdrawal(100);
        System.out.println(Larry);

        BankAccount Mary = new BankAccount(300, "Mary's");
        Mary.deposit(100);
        System.out.println(Mary);
    }
}/
         */