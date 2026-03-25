package hw1;

public class Radios {
	public static double area (double radios) {
		
		return (double) (radios*radios*3.14);
	}
	public static double CircumFerence (double radios) {
		return (double)(radios*2*3.14);
	}
		
	public static void main(String[]args) {
		double i=area(5.0);
		double y=CircumFerence(5.0);
		System.out.println("圓周長為:"+i);
		System.out.println("圓面積為:"+y);
		
		
	}

}
