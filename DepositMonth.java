package ua.org.oa.stepanovas;
// Расчет депозита с помесячной выплатой процентов
public class DepositMonth extends Deposit {

	public double getSum(int nTime) {
		if (nTime < getTime())
			return 0;

		return (sumStart + (sumStart * getDiscont() * getTime() / getDays() * 100.0));

	}
}
