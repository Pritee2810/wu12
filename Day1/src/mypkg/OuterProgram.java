package mypkg;

public class OuterProgram {
	String name="first class";
	
	public void outerShow()
	{
		System.out.println("outer program");
	}
	
	class InnerProgram{
		public void show(){
			System.out.println("inner class");
		}
	}
	
	static class StaticInnerProgram{
		public void display() {
			System.out.println("static inner class");
		}
	}
}
