package ua.org.oa.stepanovas;

public class DepositFreeUse extends Deposit {
	private double sumIncrease = 0; // сумма довложения

	public DepositFreeUse(String nname, String currency, int ntime, double nsumStart, double ndiscont,
			double sumIncrease) {
		super(nname, currency, ntime, nsumStart, ndiscont, sumIncrease);
	}

	public double calculateDeposit(int nTime) {
		if (nTime < getTime())
			return 0;

		return getSumIncrease() + this.getSumStart() + getDiscont() / getDays() * 100.0
				* (this.getSumStart() * getTime() + getSumIncrease() * getTime1());

	}

	@Override
	public double calculateDeposit() {

		return sumIncrease;
	}

}
