package exercise1;

public class BaseSalaryPlusCommisionEmployee extends Employee{      //pour dire que cette classe herite de la classe Employee

	private int baseSalary;
	private int commission;
	 public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission)
	 {
	 	super(name);
	 	this.baseSalary=baseSalary;
	 	this.commission=commission;
	 }

@override
int computeSalary()  //definition de la methode computeSalary de la classe Employé
{
	return (this.baseSalary+ getsales()*this.commission);
}
}
