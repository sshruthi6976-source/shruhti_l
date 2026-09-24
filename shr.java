import java.util.*;
public class shr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("**********************");
            System.out.println("Welcome to the ATM!");
            System.out.println("BANKING PROGRAM");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw();
                case 4 -> {
                    exit();
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }

         
    }
    static void showBalance(double balance) {
        System.out.println("**********************");
        System.out.printf("Your current balance is: $%.2f%n", balance);

    }  
    static double deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be deposited:");
        double amount = sc.nextDouble();
        if(amount > 0){
            return amount;
        

        }
        else{
            System.out.println("Invalid deposit amount.");
        }
        return 0;

    }
    static double withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        double amount = sc.nextDouble();
        if(amount > 0){
            return amount;
        }
        else{
            System.out.println("Invalid withdraw amount.");
        }
        return 0;
    }
    static void exit(){
        System.out.println("Thank you for using the ATM. Goodbye!");
    }

    
    

}
        
