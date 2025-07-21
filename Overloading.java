
class Calculator {
	
	public void add(int a,int b) {
		int result = a+b;
		System.out.println(a+" + "+b+" = "+result);
	}
	
	public void add(int a,int b ,int c) {
		int result = a+b+c;
		System.out.println(a+" + "+b+" + "+c+" = "+result);
	}
	
	public void add(double a,double b) {
		double result = a+b;
		System.out.println(a+" + "+b+" = "+result);
	}
	
	public void add(String str,int a) {
		String result = str+a;
		System.out.println(str+" + "+a+" = "+result);
	}

}


public class Overloading {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		//String str = "SJCET"; 
		
		calc.add(6, 4);
		calc.add(5, 3, 2);
		calc.add(14.6, 5.4);
		calc.add("SJCET",7);
	}

}
