package ua.org.oa.stepanovas;

import java.text.DecimalFormat;

public class DepositMain {

	private static Object getSum;

	public static void main(String[] args) {
		Deposit[] myArr;
		myArr = new Deposit[7];
		myArr[0] = new Deposit();
		myArr[0].setParams("Number1", "grn", 120, 9000, 20);
		myArr[1] = new Deposit();
		myArr[1].setParams("Number2", "grn", 180, 10000, 24);
		myArr[2] = new Deposit();
		myArr[2].setParams("Number3", "grn", 100, 50000, 16);
		myArr[3] = new Deposit();
		myArr[3].setParams("Number4", "usd", 60, 15000, 18);
		myArr[4] = new Deposit();
		myArr[4].setParams("Number5", "usd", 120, 1000, 10);
		myArr[5] = new Deposit();
		myArr[5].setParams("Number6", "euro", 120, 12000, 12);
		myArr[6] = new DepositSimple();
		myArr[6].setParams("Number7", "euro", 30, 5000, 9);
		System.out.println(" sum = " +  myArr[6].getSumSimple(32));
		
		
	}

}
