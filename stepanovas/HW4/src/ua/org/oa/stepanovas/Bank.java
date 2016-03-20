package ua.org.oa.stepanovas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank implements Iterable<Deposit> {

	private List<Deposit> deposits;
	
	
	public Bank() {
		this.deposits = new ArrayList<Deposit>();
	}

	public void addDeposit(Deposit dep) { // метод добавления депозита в
		// ArrayList
		this.deposits.add(dep);
	}

	public List<Deposit> getAllDeposits() {
		return this.deposits;
	}
	
	public Deposit getDeposit(int index) {
		if(index < this.deposits.size()){
			return this.deposits.get(index);
		}
		
		return null;
	}

	@Override
	public Iterator<Deposit> iterator() { // метод позволяющий итерироваться
		return this.deposits.iterator();
	}

}