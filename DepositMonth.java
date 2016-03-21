package ua.org.oa.stepanovas;

public class DepositMonth extends Deposit {

	public DepositMonth(String nname, String currency, int expected_time, double nsumStart, double ndiscont) { // класса
		super(nname, currency, expected_time, nsumStart, ndiscont);
	}

	public double calculateDeposit(int nTime) {
		if (actual_time < expected_time)
			return 0;

		return (this.getSumStart() + (this.getSumStart() * getDiscont() * getTime() / getDays() * 100.0));

	}

	@Override
	public double calculateDeposit() {

		return 0;
	}
}
