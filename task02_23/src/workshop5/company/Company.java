package workshop5.company;

public class Company {
	private double salary =0.0;
	private double annualIncome =0.0;
	private double income = 0;
	private double bonus =income*(1.2);
	private double afterTaxBonus = 0.0;
	
	
	
	



	public Company(double salary, double annualIncome, double bonus, double afterTaxBonus) {
		this.salary = salary;
		this.annualIncome = annualIncome;
		this.bonus = bonus;
		this.afterTaxBonus = afterTaxBonus;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}



	
	
//	public double getIncome() {
//		
//	}
//	
//	public double getAfterTaxIncome() {
//		
//	}
//	
//	public double getBonus() {
//		
//	}
//	
//	public double getAfterTaxBonus() {
//		
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}

	public void setIncome(double income) {
		this.income = income;
	}



	
	
	
}
