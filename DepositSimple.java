
package ua.org.oa.stepanovas;

import java.text.DecimalFormat;

public class DepositSimple extends Deposit {

	public double calculateDeposit (int nTime)
	{
		if(nTime < getTime())
			return 0;
		return sumStart + getDiscont() / 100.0 * sumStart / getDays() * nTime;
		
	}

	@Override
	public double calculateDeposit() {
		// TODO Auto-generated method stub
		return 0;
	}
}
