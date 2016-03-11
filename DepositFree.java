package ua.org.oa.stepanovas;

public class DepositFree extends Deposit {
	public double getSum (int nTime)
	{
		if(nTime < getTime()) return 0;
		return nTime;
		
		//return (sumStart + (sumStart * getDiscont() * getTime() / getDays() * 100.0));
		
		 
	}
}
