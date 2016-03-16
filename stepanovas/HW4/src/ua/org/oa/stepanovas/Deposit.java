package ua.org.oa.stepanovas;

public abstract class Deposit {

	private String name = null; 
	private String kind = null; 
	private int time = 0; 
	private int time1 = 0; 
	public static final int DAYS = 365;
	//protected final int NUMBER = 100;
	public double sumStart = 0; 
	private double sumIncrease = 0; 
	private double sumFinal = 0; 
								
	private double discont = 0; 

	public double getSum (int nTime)
	{
		return 0;
	}
	
	

	public String getName() {
		return name;
	}

	public String getKind() {
		return kind;
	}

	public int getTime() {
		return time;
	}

	public double getSumStart() {
		return sumStart;
	}

	public double getDiscont() {
		return discont;
	}

	public double getSumIncrease() {
		return discont;
	}
	public double getTime1() {
		return 0;
	}
	
	
	public void setParams(String nname, String nkind, int ntime, double nsumStart, double ndiscont) {
		System.out.println("Deposit " + nname + "  valuta: " + nkind + "   days:" + ntime + "   summ: " + nsumStart
				+ "  discont: " + ndiscont + " % ");

		name = nname;
		kind = nkind;
		time = ntime;
		sumStart = nsumStart;
		discont = ndiscont;
		
	}

	public static int getDays() {
		return DAYS;
	}



	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public abstract double calculateDeposit();


	public void addDeposit(String nname, String nkind, int ntime, double nsumStart, double ndiscont) {
		
	}



	
}
	
	
	

	
		
	

