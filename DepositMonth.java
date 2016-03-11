package ua.org.oa.stepanovas;

public class DepositMonth extends Deposit {

	public double getSum(int nTime) {
		if (nTime < getTime())
			return 0;

		return (sumStart + (sumStart * getDiscont() * getTime() / getDays() * 100.0));

	}
}
