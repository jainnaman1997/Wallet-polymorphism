package com.cg.pl;
import com.cg.bean.*;
public class MyWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account ob1=new SavingAccount(101, 222222222, "Raja", 25000.00);
		//ob1.setInterest();
		System.out.println(ob1);
		double b2=ob1.withdraw(2500.00);
		System.out.println(b2);
		
		SavingAccount s1=(SavingAccount) ob1;
		s1.setInterest();
		System.out.println(ob1);
		
		SavingAccount ob2=new SavingAccount(105, 222222, "Ram", 55000.00);
		printAcc(ob2);
		
		System.out.println((ob2 instanceof SavingAccount));
		System.out.println((ob2 instanceof Account));
		System.out.println((ob2 instanceof Object));
		//System.out.println((ob2 instanceof String));
		
	}
	
	public static void printAcc(Account a) {
		System.out.println(a);
	}

}
