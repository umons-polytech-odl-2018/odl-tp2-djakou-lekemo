package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int FixedSalary;
	public FixedSalaryEmployee( String name, int FixedSalary ){
		super (name);
		this.FixedSalary = FixedSalary;
	}
	@Override
	public int computeSalary()
	{
		return this.FixedSalary;
	}

}
