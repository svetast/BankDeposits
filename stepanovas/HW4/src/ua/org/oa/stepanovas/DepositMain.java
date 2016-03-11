package ua.org.oa.stepanovas;

import java.text.DecimalFormat;

public class DepositMain {

	private static Object getSum;

	public static void main(String[] args) {
		Deposit[] myArr;
		myArr = new Deposit[6];
		myArr[0] = new Deposit();
		myArr[0].setParams("Deposit Simple", "grn", 120, 9000, 20);
		myArr[1] = new Deposit();
		myArr[1].setParams("Deposit Simple", "grn", 180, 10000, 24);
		myArr[2] = new Deposit();
		myArr[2].setParams("Deposit Month", "grn", 100, 50000, 16);
		myArr[3] = new Deposit();
		myArr[3].setParams("Deposit Month", "usd", 60, 15000, 10);
		myArr[4] = new Deposit();
		myArr[4].setParams("Deposit Free", "usd", 30, 1000, 8);
		myArr[5] = new Deposit();
		myArr[5].setParams("Deposit Free", "euro", 365, 12000, 6);
				System.out.println(" sum = " +  myArr[5].getSum(32));// primer
		
		
	}

}
