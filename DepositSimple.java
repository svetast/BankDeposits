// Расчет депозита с простым начислением процентов
package ua.org.oa.stepanovas;

import java.text.DecimalFormat;

public class DepositSimple extends Deposit {

	public double getSum (int nTime)
	{
		if(nTime < getTime()) return 0;
		return sumStart + getDiscont() / 100.0 * sumStart / getDays() * nTime;
		
	}
}
