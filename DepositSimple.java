package ua.org.oa.stepanovas;

import java.text.DecimalFormat;

public class DepositSimple extends Deposit {

	public DepositSimple(String nname, 
			String currency, 
			int ntime, 
			double nsumStart, 
			double ndiscont) {																																								// класса
		super(nname, currency, ntime, nsumStart, ndiscont);
	}

	public double calculateDeposit(int nTime) {
		if (nTime < getTime())
			return 0;
		return this.getSumStart() + getDiscont() / 100.0 * this.getSumStart() / getDays() * nTime;

	}

	@Override
	public double calculateDeposit() {
		
		return 0;
	}

}
