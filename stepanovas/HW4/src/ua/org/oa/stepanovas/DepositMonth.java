package ua.org.oa.stepanovas;
public class DepositMonth extends Deposit {

	public double calculateDeposit(int nTime) {
		if (nTime < getTime())
			return 0;

		return (sumStart + (sumStart * getDiscont() * getTime() / getDays() * 100.0));

	}

	@Override
	public double calculateDeposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
