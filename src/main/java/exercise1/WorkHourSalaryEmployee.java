package exercise1;

public class WorkHourSalaryEmployee  extends Employee{
	protected int hourRate;
	public WorkHourSalaryEmployee(String name, int hourRate){
		super(name);
		this.hourRate= hourRate;
	}
	@Override
	public int computeSalary() {

		return hourRate*getWorkedHours();
	}

}
