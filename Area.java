class AreaCalculator{
	
	public void area(double r) {
		double result = 3.14f*r*r;
		double res = Math.round(result*100.0)/100.0;
		System.out.println("Area of circle: "+res);
	}
	
	public void area(float l, float w) {
		float result = l*w;
		System.out.println("Area of rectangle: "+result);
	}
	
	public void area(double b, double h) {
		double result = (b*h)/2;
		System.out.println("Area of triangle: "+result);
	}
	public void area(int a) {
		int result = a*2;
		System.out.println("Area of square: "+result);
	}
}

public class Area {
	public static void main(String[] a) {
		AreaCalculator calc = new AreaCalculator();
		
		calc.area(5.5);
		calc.area(4.0, 6.0);
		calc.area(6.3, 4.7);
		calc.area(8);
	}
}