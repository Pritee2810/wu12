package mypkg;

public abstract class Employee {
	//instance variable
	int empid;
	
	String FirstName, LastName;
	
	float salary;
	static String company="Western union";
	static int cnt=0;
	
	
	public Employee(){
		cnt++;
		System.out.println(cnt+" emp created");
	}
	
	public Employee(int empid, String FirstName, String LastName, float salary) {
		this.empid=empid;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.salary=salary;
		//System.out.println("ok");
	}
	public Employee(int empid, String FirstName) {
		this.empid=empid;
		this.FirstName=FirstName;
	}
	public float TotalSalary() {
		float hra=salary*.1f;
		float da=salary*.2f;
		return salary+hra+da;
	}
	public void Increment(float salary) {
		salary=salary+.1f+salary;
		System.out.println("updated salary "+ salary);
	}
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	public String getFirstNmae() {
		return this.FirstName;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	public void display() {
		System.out.println("employee id "+this.empid);
		System.out.println("first name "+this.FirstName);
		System.out.println("last name "+this.LastName);
		System.out.println("company "+Employee.company);
		System.out.println("total salary "+ this.salary);
	}
	
	/*public String toString() {
		return "Employee{"+
	"Empid="+Empid+												//tostring
	",FirstName="+FirstName+"\"
	}*/
	
	
	
	abstract public void skill(String sk1, String sk2);
}
