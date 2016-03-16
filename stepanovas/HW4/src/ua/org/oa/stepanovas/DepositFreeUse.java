package ua.org.oa.stepanovas;

public class DepositFreeUse extends Deposit { 
												
	public double getSum (int nTime)
	{
		if(nTime < getTime()) 
			return 0;
		
		
		return getSumIncrease() + sumStart + getDiscont()/getDays()*100.0 *(sumStart * getTime()+
				getSumIncrease()*getTime1()) ;			
				
		 
	}

	}
