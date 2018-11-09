package exercise1;

public class Employee {

	private String name;
	private int Sales = 0;
	private int workedHours =0;

	public Employee(String name){
		this.name= name;
	}

	public int computeSalary() {
		return 0;
	}

	public void sell() {
		Sales ++;
	}

	public void workOneHour() {
		workedHours ++;
	}

	public String getName() {
		return name;
	}
	public int getWorkedHours(){ return workedHours;}
	public  int getSales(){return Sales;}
}
