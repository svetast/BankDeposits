package ua.org.oa.stepanovas;

public abstract class Deposit {
	private static final int DAYS = 0;
	private String name = null; // название депозита
	private String currency = null; // валюта депозита
	protected int expected_time = 0; // срок депозита в днях по договору
	protected int actual_time = 0; // фактический срок депозита
	private double sumStart = 0; // стартовая сумма депозита
	private double sumFinal = 0; // сумма выплате = основная сумма + проценты
	private double discont = 0; // ставка по депозиту

	public Deposit(String name, String currency, int expected_time, double sumStart, double discont) {
		super();
		this.name = name;
		this.currency = currency;
		this.expected_time = expected_time;
		this.sumStart = sumStart;
		this.discont = discont;

	}

	Deposit(String nname, String currency2, int ntime, double nsumStart, double ndiscont, double sumIncrease) {
	}

	public String getName() {
		return name;
	}

	public String getKind() {
		return currency;
	}

	public int getTime() {
		return expected_time;
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
		currency = nkind;
		expected_time = ntime;
		sumStart = nsumStart;
		discont = ndiscont;

	}

	public static int getDays() {
		return DAYS;
	}

	void setTime1(int time1) {
		this.actual_time = time1;
	}

	public abstract double calculateDeposit();

	@Override
	public String toString() {
		return "Deposit [name=" + name + ", currency=" + currency + ", expected_time=" + expected_time
				+ ", actual_time=" + actual_time + ", sumStart=" + sumStart + ", sumFinal=" + sumFinal + ", discont="
				+ discont + "]";
	}

	
}
