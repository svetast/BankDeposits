package ua.org.oa.stepanovas;


public class DepositMonth extends Deposit {

	public DepositMonth(String nname, 
			String currency, 
			int ntime, 
			double nsumStart, 
			double ndiscont) {																																								// класса
		super(nname, currency, ntime, nsumStart, ndiscont);
	}
	
	public double calculateDeposit(int nTime) {
		if (nTime < getTime())
			return 0;

		return (this.getSumStart() + 
				(this.getSumStart() * getDiscont() * 
						getTime() / getDays() * 100.0));

	}

	@Override
	public double calculateDeposit() {
		// TODO Auto-generated method stub
		return 0;
	}}
