package ua.org.oa.stepanovas;

import java.util.Arrays;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		Bank bank = new Bank(); // конструктор

		bank.addDeposit(new DepositSimple("DepositSimple", "grn", 100, 20000, 13));
		bank.addDeposit(new DepositSimple("DepositSimple", "euro", 60, 12000, 10));
		
		bank.addDeposit(new DepositMonth("DepositMonth", "usd", 270, 15000, 11));
		bank.addDeposit(new DepositMonth("DepositMonth", "grn", 90, 10000, 9));
		
		bank.addDeposit(new DepositFreeUse("DepositFreeUse", "usd", 50, 40000, 14, 500));
		bank.addDeposit(new DepositFreeUse("DepositFreeUse", "euro", 30, 60000, 22, 500));

		for (Deposit d : bank) {
			System.out.println(d);
		}
	}
}

