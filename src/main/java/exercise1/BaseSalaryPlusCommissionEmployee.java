package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{
	private int baseSalar;
	private int commission;
	public BaseSalaryPlusCommissionEmployee( String name, int baseSalar,int commission){
		super(name);
		this.baseSalar= baseSalar;
		this.commission= commission;
	}
	@Override
	public int computeSalary() {
		return baseSalar+getSales()*commission;
	}
}
