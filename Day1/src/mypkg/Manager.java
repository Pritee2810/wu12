package mypkg;

public class Manager extends Employee{
	String Team;
	int NoEmp;
	String skill[]=new String[2];
	public Manager() {
		System.out.println("manager is created");
	}
	public Manager(String Team, int NoEmp) {
		this.Team=Team;
		this.NoEmp=NoEmp;
	}
	
	public void skill(String sk1, String sk2) {
		skill[0]=sk1;
		skill[1]=sk2;
	}
}
