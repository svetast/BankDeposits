package ua.org.oa.stepanovas;

public class DepositFreeUse extends Deposit { 
												
	public double calculateDeposit (int nTime)
	{
		if(nTime < getTime()) 
			return 0;
		
		
		return getSumIncrease() + sumStart + getDiscont()/getDays()*100.0 *(sumStart * getTime()+
				getSumIncrease()*getTime1()) ;			
				
		 
	}

	@Override
	public double calculateDeposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	}
