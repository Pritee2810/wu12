package day1.basic;

public class Area {
	public void A(int side)
	{
		System.out.println("Area of square is: "+ side*side);
	}
	public void A(int length, int breadth) {
		System.out.println("Area of rectangle is: "+ length*breadth);
	}
	public void A(float length, float breadth) {
		System.out.println("Area of rect is: "+ length*breadth);
	}
	public static void main(String[] args) {
		Area a=new Area();
		a.A(4);
		a.A(2, 3);
		a.A(4.2f,2.0f);
		
	}
}
