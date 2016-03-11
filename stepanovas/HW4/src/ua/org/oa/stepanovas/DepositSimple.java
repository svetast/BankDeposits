// Расчет депозита с простым начислением процентов
package ua.org.oa.stepanovas;

public class DepositSimple extends Deposit {

	public DepositSimple() {

		DepositSimple DepositSimple1 = new DepositSimple();

		int sumPercent = this.getSumStart() * this.getDiscont() * this.getTime() / this.getDays() * this.NUMBER;
		this.setSumPercent(this.getSumPercent());
		System.out.println("Аmount % for paid: " + sumPercent);

		int sumFinal = this.getSumStart() + (this.getSumStart() * this.getDiscont() * this.getTime()) / this.getDays()
				* this.NUMBER;
		System.out.println("Amount All: " + sumFinal);

		// sumFinal = sumStart + (sumStart * discont * time)/(DAYS*100) формула
		
	}
}
