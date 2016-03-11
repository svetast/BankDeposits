package ua.org.oa.stepanovas;

public class DepositMonth extends Deposit {
	
	public double getSumMonth (int nTime)
	{
		if(nTime < getTime()) return 0;
		//return sumStart + getDiscont() / 100.0 * sumStart / getDays() * nTime;
		System.out.println(sumStart + (sumStart * getDiscont() * nTime/ getDays() * 100.0));
		return 0;
		 
	}
}
