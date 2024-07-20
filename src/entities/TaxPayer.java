package entities;

public class TaxPayer {
	// Atributos
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	// Métodos Getters e Setters
	
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	
	public double getSalaryIncome() {
		return salaryIncome;
	}
	
	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	
	public double getServicesIncome() {
		return servicesIncome;
	}
	
	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	
	public double getCapitalIncome() {
		return capitalIncome;
	}
	
	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	public double getHealthSpending() {
		return healthSpending;
	}
	
	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	public double getEducationSpending() {
		return educationSpending;
	}
	
	
	// Método Construtor
	public TaxPayer() {
		
	}
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	// Métodos
	public double salaryTax() {
		double salary = salaryIncome / 12;
		double taxSalary = 0;
		if(salary < 3000) {
			//salary = salary;
		} else if(salary < 5000) {
			//salary -= (salary * 0.10);
			taxSalary = salaryIncome * 0.10;			
		} else if(salary >= 5000) {
			//salary -= (salary * 0.20);
			taxSalary = salaryIncome * 0.20;
		}		
		return taxSalary;
		// 37800 + 8277,73 + 4000,00 = 50077,73
	}
	
	public double servicesTax() {
		double taxServicesIncome;
		if(servicesIncome > 0) { 
			taxServicesIncome = servicesIncome * 0.15;
		} else {
			taxServicesIncome = servicesIncome;
		}
		return taxServicesIncome;
	}
	
	public double capitalTax() {
		double capitalTax;
		if(capitalIncome > 0) {
			capitalTax = (capitalIncome * 0.20);
		} else {
			capitalTax = capitalIncome;
		}
		return capitalTax;
	}
	
	public double grossTax() {
		double grossTax = salaryTax() + servicesTax() + capitalTax();
		return grossTax;
	}
	
	public double taxRebate() {
		double taxRebate;
		if(grossTax() * 0.30 > (healthSpending  + educationSpending)) {
			taxRebate = healthSpending + educationSpending;
		} else {
			taxRebate = grossTax() * 0.30;
		}
		return taxRebate;
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	public String toString() {
		return "Imposto bruto total: "
				+ String.format("%.2f%n",grossTax())
				+ String.format("Abatimento: %.2f%n", taxRebate())
				+ String.format("Imposto devido: %.2f%n", netTax());
	}
}
