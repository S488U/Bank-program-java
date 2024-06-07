import java.util.Scanner;
import mypackage.Bank;

public class Account {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Bank bank = new Bank();
        
        float amount;
        int ch;

        do {
            System.out.println("1. Balance\n2. Profile\n3. Withdraw\n4. Deposit\n5. Update KYC\n6. Exit");
            System.out.print("Enter the number: ");
            ch = obj.nextInt();
            switch(ch) {
                case 1 : {
                    System.out.println("Balance is: " + bank.balance());
                    break;
                }

                case 2 : {
                    System.out.println("Profile: \n" + bank.profile());
                    break;
                }

                case 3 : {
                    System.out.print("Enter the Amount to be withdrawn: ");
                    amount = obj.nextFloat();

                    if (bank.balance() < amount) {
                        System.out.println("Your Balance is less than " + amount + ". Can't withdraw");
                    } else {
                        System.out.println(amount + " Amount withdrawn.");
                        System.out.println("Balance is: " + bank.withdraw(amount));
                    }
                    break;
                }

                case 4 : {
                    System.out.print("Enter the Amount to be deposited: ");
                    amount = obj.nextFloat();
                    System.out.println(amount + " Amount Credited to your Account.");
                    System.out.println("Balance is: " + bank.deposit(amount));
                    break;
                }

                case 5 : {
                    String name, gender, occupation, country, state;
                    int age;
                    System.out.println("Update your KYC: ");
                    System.out.print("Enter your Name: ");
                    name = obj.next();
                    System.out.print("Enter the Age: ");
                    age = obj.nextInt();
                    System.out.print("Enter the Gender: ");
                    gender = obj.next();
                    System.out.print("Enter your Occupation: ");
                    occupation = obj.next();
                    System.out.print("Enter your Country: ");
                    obj.nextLine();  // Consume the newline character left by obj.nextInt()
                    country = obj.nextLine();
                    System.out.print("Enter your State: ");
                    state = obj.next();

                    System.out.println("Updated KYC: \n" + bank.updateProfile(name, age, gender, occupation, country, state));
                    break;
                }

                case 6 : {
                    System.out.println("Exiting... Thank you for using our banking system!");
                    System.exit(0);
                }

                default : {
                    System.out.println("Invalid option. Please choose a number from 1 to 6.");
                    break;
                }
            }

        } while (ch != 6);

        obj.close();
    }
}
