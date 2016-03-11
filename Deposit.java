package ua.org.oa.stepanovas;

public class Deposit {

	private String name = null; // название вклада
	private String kind = null; // валюта вклада
	private int time = 0; // срок вклада в календарных днях
	public static final int DAYS = 365;// количество дней в календарном году
	protected final int NUMBER = 100;// коэффициент для расчетов
	public int sumStart = 0; // сумма вклада
	private int sumIncrease = 0; // сумма довложения по вкладу
	private int sumFinal = 0; // сумма к возврату вкладчику = первоначальная
								// сумма+проценты
	public int sumPercent = 0; // сумма процентов (доходов).
	private int discont = 0; // годовая процентная ставка по депозиту

	public static void main(String[] args) {
		Deposit[] myArr;
		myArr = new Deposit[7];
		myArr[0] = new Deposit();
		myArr[0].setParams("Number1", "grn", 120, 9000, 20);
		myArr[1] = new Deposit();
		myArr[1].setParams("Number2", "grn", 180, 10000, 24);
		myArr[2] = new Deposit();
		myArr[2].setParams("Number3", "grn", 100, 50000, 16);
		myArr[3] = new Deposit();
		myArr[3].setParams("Number4", "usd", 60, 15000, 18);
		myArr[4] = new Deposit();
		myArr[4].setParams("Number5", "usd", 120, 1000, 10);
		myArr[5] = new Deposit();
		myArr[5].setParams("Number6", "euro", 120, 12000, 12);
		myArr[6] = new Deposit();
		myArr[6].setParams("Number7", "euro", 30, 5000, 9);

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

	public int getSumStart() {
		return sumStart;
	}

	public int getDiscont() {
		return (int) discont;
	}

	//  исходные данные по видам депозитов - информативно:
	public void setParams(String nname, String nkind, int ntime, int nsumStart, double ndiscont) {
		System.out.println("Deposit " + nname + "  valuta: " + nkind + "   days:" + ntime + "   summ: " + nsumStart
				+ "  discont: " + ndiscont + " % ");

		name = nname;
		kind = nkind;
		time = ntime;
		sumStart = nsumStart;
		discont = (int) ndiscont;
	}

	public static int getDays() {
		return DAYS;
	}

	public int getSumPercent() {
		return sumPercent;
	}

	public int setSumPercent(int sumPercent) {
		this.sumPercent = sumPercent;
		return sumPercent;
	}

	public int calculateDeposit(int ntime, int nsumStart, double ndiscont) {
		return discont;

	}

}
