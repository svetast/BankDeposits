package ua.org.oa.stepanovas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

	private List<Deposit> deposits = new ArrayList<Deposit>();// ArrayList для
																// храненния

	public void addDeposit(Deposit dep) { // метод добавления депозита в
											// ArrayList
		this.deposits.add(dep);
	}

	Deposit myDeposit = new Deposit(); // конструктор
	{
	myDeposit.addDeposit("Deposit Simple", "grn", 120, 9000, 20);
	myDeposit.addDeposit("Deposit Simple", "grn", 180, 10000, 24);
	myDeposit.addDeposit("Deposit Month", "grn", 100, 50000, 16);
	myDeposit.addDeposit("Deposit Month", "usd", 60, 15000, 10);
	myDeposit.addDeposit("Deposit FreeUse", "usd", 30, 1000, 8);
	myDeposit.addDeposit("Deposit FreeUse", "euro", 365, 12000, 6);
	
	for (Deposit deposit : deposits) {
		System.out.println(deposit);}
	}
	

		
	public List<Deposit> getDeposit() {
		return this.deposits;
	}

	public Iterator<Deposit> iterator() { // метод позволяющий итерироваться
		return this.deposits.iterator();
	}

	
}