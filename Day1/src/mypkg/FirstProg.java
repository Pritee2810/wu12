package mypkg;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		//Employee emp2=new Employee();
		Employee emp2=new Employee(1, "P", "G",345.3487f );
		
		System.out.println("....total salary of ram......");
		System.out.println(emp2.TotalSalary());
		emp2.Increment(emp2.salary);
		System.out.println();
		emp2.display();
		emp1.display();
		
		
		
		
		
		
		
		
		//======================
		System.out.println("==========================================");
		OuterProgram outer=new OuterProgram();
		OuterProgram.InnerProgram inn=new OuterProgram().new InnerProgram();
		inn.show();
		
		OuterProgram.InnerProgram inn1=outer.new InnerProgram();
		inn.show();
		
		
		
		
		OuterProgram.StaticInnerProgram statInn=new OuterProgram.StaticInnerProgram();
		statInn.display();
		
		Manager m1= new Manager();
		System.out.println(m1.company);
		//System.out.println(m1.count);
	}
}
