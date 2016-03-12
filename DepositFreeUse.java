package ua.org.oa.stepanovas;
// Расчет депозита с с возможностью пополнения
public class DepositFreeUse extends Deposit { 
												
	public double getSum (int nTime)
	{
		if(nTime < getTime()) 
			return 0;
		
		
		return getSumIncrease() + sumStart + getDiscont()/getDays()*100.0 *(sumStart * getTime()+
				getSumIncrease()*getTime1()) ;			
				
		 
	}

	}
	
	

