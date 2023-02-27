package project;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BankDetails> bank=new ArrayList<BankDetails>();
		Scanner sc=new Scanner(System.in);
		String account_number;
		String name;
		String mobile_no;
		double balance;
		double deposit;
		double withdraw;
		
		int choice;
		System.out.println("=============================================");
		System.out.println("***************WELCOME TO BANK***************");
		System.out.println("=============================================");
		
		
		while(true) {
			System.out.println("=============================================");
			System.out.println(" 1. Create Account.");
			System.out.println(" 2. Check Balance.");
			System.out.println(" 3. Deposit Money.");
			System.out.println(" 4. Withdraw Money.");
			System.out.println(" 5. Exit.");
			System.out.println("=============================================");
			System.out.print(" Enter your choice :");
			choice=sc.nextInt();
			
			switch(choice) {
				//===============Create Account===============
			case 1: 
				System.out.println("=============================================");
				System.out.print("Enter Account Number : ");
				account_number=sc.next();
				System.out.print("Enter Name :");
				name=sc.next();
				System.out.print("Enter Mobile Number : ");
				mobile_no=sc.next();
				System.out.print("Enter Deposit Amount : ");
				balance=sc.nextDouble();
				BankDetails b=new BankDetails();
				b.setAccount_number(account_number);
				b.setName(name);
				b.setBalance(balance);
				b.setMobile_no(mobile_no);
				
				bank.add(b); //Adding details to array list.....
				System.out.println("Record inserted successfully...");
				
				System.out.println("=============================================");
				break;
			
				
				
				//===============Check Balance===============
			case 2: 
				System.out.println("=============================================");
				System.out.print("Enter Account Number :");
				account_number=sc.next();
				//int search = 0;
				for(int i=0; i<bank.size();i++) {
					if(bank.get(i).getAccount_number().equals(account_number)) {
						System.out.println("Account Number : "+bank.get(i).getAccount_number());
						System.out.println("Your Name : "+bank.get(i).getName());
						System.out.println("Mobile Number : "+bank.get(i).getMobile_no());
						System.out.println("Your Current Balance : "+bank.get(i).getBalance());
						System.out.println("=============================================");
					}
					else {
						System.out.println("Account not found...");
					}
				}
			//	if(search==0) {
				//System.out.println("Record not Found....");
				//}
				break;
			
				
				
				//===============Deposit Money===============
			case 3:
				System.out.println("=============================================");
				System.out.print("Enter Account Number :");
				account_number=sc.next();
				//int search1=0;
				for(int i=0; i<bank.size();i++) {
					if(bank.get(i).getAccount_number().equals(account_number)) {
						
						//Bank details
						System.out.println("Account Number : "+bank.get(i).getAccount_number());
						System.out.println("Your Name : "+bank.get(i).getName());
						System.out.println("Mobile Number : "+bank.get(i).getMobile_no());
						System.out.println("Your Current Balance : "+bank.get(i).getBalance());
						
						//deposit process
						System.out.print("Enter deposit amount : ");
						double damount=sc.nextDouble();
						balance=bank.get(i).getBalance();
						BankDetails b1=bank.get(i);
						b1.setBalance(balance+damount);
						System.out.println(+damount+" Rupees deposited to your account Successfully..");
						System.out.println("Your Current Balance Amount is : "+bank.get(i).getBalance());
						System.out.println("=============================================");
					}
					else {
						System.out.println("Account not found...");
					}
					}
				//	if(search1==0) {
					//	System.out.println("Record not Found....");
				//}
				
				break;
			
				
				
				//===============Withdraw Money===============
			case 4:
				System.out.println("=============================================");
				System.out.print("Enter Account Number : ");
				account_number=sc.next();
				//int search2=0;
				for(int i=0; i<bank.size();i++) {
					if(bank.get(i).getAccount_number().equals(account_number)) {
						
						//Bank details
						System.out.println("Account Number : "+bank.get(i).getAccount_number());
						System.out.println("Your Name : "+bank.get(i).getName());
						System.out.println("Mobile Number : "+bank.get(i).getMobile_no());
						System.out.println("Your Current Balance : "+bank.get(i).getBalance());
						
						//withdraw process
						System.out.print("Enter withdraw amount : ");
						double wamount=sc.nextDouble();
						balance=bank.get(i).getBalance();
						BankDetails b1=bank.get(i);
						if(balance-wamount<1000) {
							System.out.println("Minimum 1000 Rs. Balance Amount Required...");
						}
						else {
							b1.setBalance(balance-wamount);
							System.out.println(+wamount+" Rupees withdrawed from your account Successfully..");
							System.out.println("Your Current Balance Amount is : "+bank.get(i).getBalance());
						}
						System.out.println("=============================================");
					}
					else {
						System.out.println("Account not found...");
					}
					}
					//if(search2==0) {
					//System.out.println("Record not Found....");
					//}
				break;
				
				
				
				//===============Exit===============
			case 5:
				System.err.println("Closed...");
				System.exit(0);
				break;
				default:
					System.out.println("=============================================");
					System.out.println("Invalid choice! choose from given options only..");
					System.out.println("=============================================");
					break;
			}
		}

	}

}
