import java.io.*;
class PointViewer {
	public static void main(String[] args) throws FileNotFoundException {
		Point r = new Point();
		r.method();
		Calculator g = new Calculator(r);
		System.out.println(g.getDistance());
	}
}