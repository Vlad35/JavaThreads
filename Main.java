package Calculator;

public class Main {
	private static double func(double x) {
		return 4 / (1 + x*x);
	}
	public static void main(String[] args) {
		 Calculator i1 = new Calculator(10);
	     i1.run();
	     double x = i1.getResult();
	     System.out.println(func(x));

	}

}
