package ua.org.oa.stepanovas;

public class DepositFreeUse extends Deposit { // только с возможностью пополнения
												
	public double getSum (int nTime)
	{
		if(nTime < getTime()) ;
		return 0;
		
		return getDiscont()/getDays()*100.0 *(sumStart *getTime()+getSumIncrease()*getTime1()) + sumStart +getSumIncrease());			
				
		 
	}
	
}
