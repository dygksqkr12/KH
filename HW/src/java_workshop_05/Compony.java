package java_workshop_05;

public class Compony {
	private double salary;
	private double annualIncome;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Compony(double salary) {
		super();
		this.salary = salary;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return salary *  12;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getAfterTaxIncome() {
		return getAnnualIncome() * 0.9;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public double getBonus() {
		return (salary * 0.2) * 4;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		return getBonus() * 0.945 ;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
}

