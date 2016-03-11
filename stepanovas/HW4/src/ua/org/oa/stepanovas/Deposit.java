package ua.org.oa.stepanovas;

public class Deposit {

	private String name = null; // название вклада
	private String kind = null; // валюта вклада
	private int time = 0; // срок вклада в календарных днях
	private int time1 = 0; // срок вклада ( довложения) в календарных днях
	public static final int DAYS = 365;// количество дней в календарном году
	//protected final int NUMBER = 100;// коэффициент для расчетов
	public double sumStart = 0; // сумма вклада
	private double sumIncrease = 0; // сумма довложения по вкладу
	private double sumFinal = 0; // сумма к возврату вкладчику = первоначальная сумма+проценты
								
	private double discont = 0; // годовая процентная ставка по депозиту

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
	
	// исходные данные по видам депозитов - информативно:
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
}
	
	
	

	
		
	


