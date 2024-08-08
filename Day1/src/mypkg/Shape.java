package mypkg;

public class Shape {
	
	public float Area(float radius) {
		float area=3.14f*radius*radius;
		return area;
	}
	public int Area(int length) {
		int area=length*length;
		return area;
	}
	public int Area(int length, int breadth) {
		int area=length*breadth;
		return area;
	}
}
