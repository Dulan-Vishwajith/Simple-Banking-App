import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){


        double balance =0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1 .Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************\n");


            System.out.print("Enter your choice (1-4): ");
            choice = Integer.parseInt(input.nextLine());
            System.out.println(" ");

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }


        }
        input.close();
        System.out.printf("\n");
        System.out.println("****************************");
        System.out.println("Thank you ! Have a nice day!");
        System.out.println("****************************");

    }

    static void showBalance(double balance){
        System.out.printf("Balance is :%.2f LKR\n\n",balance);
    }


    static double deposit(){
        double amount;

        System.out.printf("Enter an amount to be deposited : ");
        amount= Double.parseDouble(input.nextLine());

        if(amount<0){
            System.out.println("Amount can't be negative...!\n");
            return 0;
        }
        else {
            System.out.println("Deposit Success!\n");
            return amount;
        }
    }


    static double withdraw(double balance){
        double amount;

        System.out.printf("Enter an amount to be withdrawn: ");
        amount= Double.parseDouble(input.nextLine());

        if(amount < balance){
            System.out.println("Withdraw Success!\n");
            return amount;
        }
        else if(amount<0){
            System.out.println("Amount can't be negative...!");
            return 0;
        }
        else {
            System.out.println("Insufficient Account Balnace...!\n");
            return 0;
        }

    }







}
