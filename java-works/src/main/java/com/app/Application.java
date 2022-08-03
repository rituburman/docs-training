package com.app;

import java.util.Scanner;

import com.beans.Account;
import com.dao.AccountDAO;
import com.dao.IAccountDAO;

public class Application {
	public static void main(String args[]) {

		IAccountDAO dao = new AccountDAO();
		Account account = new Account();

		boolean loop = true;
		while (true) {
			String menu = "\n\n\n\t\t\t Welcome to the ABC Bank System" + "\n\nPlease choose an option ::"
					+ "\n\nPress 1 to create a new account." + "\nPress 2 for viewing account details."
					+ "\nPress 3 to check account balance." + "\nPress 4 to withdraw money."
					+ "\nPress 5 to deposit money." + "\nPress 0 to exit.";
			System.out.println(menu);

			int ch = 9;
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("You chose account creation.");

				System.out.println("Enter username: ");
				String user = sc.next();
				account.setUsername(user);
				System.out.println("Enter firstname: ");
				String fname = sc.next();
				account.setFirstname(fname);
				System.out.println("Enter lastname: ");
				String lname = sc.next();
				account.setLastname(lname);
				System.out.println("Enter mobile no: ");
				String mb = sc.next();
				if (mb.length() == 10)
					account.setMobNo(mb);
				else {
					System.out.println("Number Invalid. Please retry!");
					break;
				}
				System.out.println("Enter email: ");
				String em = sc.next();
				if (em.contains(".com"))
					account.setEmail(em);
				else {
					System.out.println("Email invalid. Please retry!");
					break;
				}
				System.out.println("Enter address: ");
				String address = sc.next();
				account.setAddress(address);
				double bal = 500;
				account.setBalance(bal);
				System.out.println("Your Account Number is: ");
				String accno = RandomString.getAlphaNumericString(12).toUpperCase();
				account.setAccNo(accno);
				System.out.println(accno);

				System.out.println(dao.createAcc(account) ? "Account Created Successfully!" : "Account not Created");
				break;

			case 2:
				System.out.println("You chose to view account details.");
				System.out.println("Enter Account number: ");
				String acc = sc.next();
				dao.getAccount(acc);
				break;

			case 3:
				System.out.println("You chose to check balance.");
				System.out.println("Enter Account number: ");
				String acc1 = sc.next();
				System.out.println("Total balance in account: ");
				System.out.print(dao.checkBalance(acc1));
				break;

			case 4:
				System.out.println("You chose to withdraw money.");
				System.out.println("Enter Account number: ");
				String acc3 = sc.next();
				System.out.println("Enter Amount: ");
				double amt = sc.nextDouble();
				System.out.println(dao.withdraw(amt, acc3));
				System.out.print("Account Balance :: ");
				System.out.print(dao.checkBalance(acc3));
				break;

			case 5:
				System.out.println("You chose to deposit money.");
				System.out.println("Enter Account number: ");
				String acc4 = sc.next();
				System.out.println("Enter Amount: ");
				double amt1 = sc.nextDouble();
				System.out.println(dao.deposit(amt1, acc4));
				System.out.print("Account Balance :: ");
				System.out.print(dao.checkBalance(acc4));
				break;

			case 0:
				System.out.println("Bye");
				System.exit(0);

			default:
				System.out.println("Invalid Choice.");
				break;

			}
		}
	}

}
