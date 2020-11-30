package com.org;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char input = 0;
		do {
			System.out.println("a. Add account");
			System.out.println("b. Remove account");
			System.out.println("c. Display account by account number");
			System.out.println("d. Display those accounts having balance less than 1000");
			System.out.println("e. Exit");
			System.out.println("Enter your option");
			input = s.next().charAt(0);
			AccountService service = new AccountService();
			switch(input) {
			
				case 'a':
					System.out.println("Enter account number : ");
					int accNo = s.nextInt();
					s.nextLine();
					System.out.println("Enter account name : ");
					String name = s.nextLine();
					System.out.println("Enter amount : ");
					double amount = s.nextDouble();
					Account account = new Account(accNo, name, amount);
					System.out.println(account);
					try {
						service.addAccount(account);
					} catch (AccountAlreadyException e) {
						e.printMessage();
					}
					break;
					
				case 'b':
					System.out.println("Enter the account number you want to remove : ");
					accNo = s.nextInt();
					try {
						service.removeAccount(accNo);
					} catch (AccountNotFoundException e) {
						e.printMessage();
					}
					break;
					
				case 'c':
					System.out.println("Enter the account number of the account you want to display : ");
					accNo = s.nextInt();
					try {
						service.displayAccount(accNo);
					} catch (AccountNotFoundException e) {
						e.printMessage();
					}
					break;
				
				case 'd':
					service.displayAccountsWithAmountLessthan1000();
					break;
				
					
			}
			
		}
		while(input != 'e');
	}

}
