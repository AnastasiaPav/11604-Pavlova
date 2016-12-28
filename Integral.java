import java.util.Scanner;
public class Integral {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		int n = s.nextInt();
		System.out.println(usualIntegral(a,b,n));
		System.out.println(trapezeIntegral(a,b,n));
		System.out.println(unusualIntegral(a,b,n));

	}

	public static double fun (double x) {
		return Math.sin(x) * x;
	}

	public static double usualIntegral (double a, double b, int n){
		double sum = 0;
		double d = (b-a)/n;
		for(double i = a; i < b; i+=d){
			sum += fun(i)*d;
		}
		return sum;
	}
	
	public static double trapezeIntegral (double a, double b, int n){
		double sum = 0;
		double d = (b-a)/n;
		for(double i = a; i < b; i+=d){
			sum += (fun(i)+fun(i+d))*d/2;
		}
		return sum;
	}
	
	public static double unusualIntegral (double a, double b, int n){
		double h, s1 = 0; s2 = 0;

		h = (b - a) / (2 * n);
		
		for(double i = a + h; i + h < b; i += 2 * h) {
			s1 += f(i);
		} 

		for(double i = a + 2 * h; i < b - 2 * h; i += 2 * h) {
			s2 += f(i);
		}

		s1 = (4 * s1 + 2 * s2 + f(a) + f(b)) * h / 3;
		return s1;
	}


}