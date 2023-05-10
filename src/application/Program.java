package application;

import model.entities.Account;
import model.exceptions.BusinessExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();


        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();


        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");

        try {
            account.withdraw(sc.nextDouble());

            System.out.printf("New Balance: %.2f%n", account.getBalance());

        } catch (BusinessExceptions msg) {
            System.out.println(msg.getMessage());
        }
        sc.close();
    }
}
