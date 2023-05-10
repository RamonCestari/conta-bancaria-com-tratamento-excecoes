package application;

import model.entities.Account;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();


            System.out.print("Holder: ");
            String holder = sc.next();
            sc.nextLine();


            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.println("New Balance: " + account.getBalance());

        } catch (InputMismatchException e) {
            System.out.println("Must be a number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
