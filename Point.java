import java.io.*;
import java.util.Scanner;
class Point {
	int x;
	int y;
	int x0;
	int y0;

	void method() throws FileNotFoundException{
		File f = new File("С:\\Way.txt");
		Scanner t = new Scanner(f);
		t.useDelimiter(", ");
		x = t.nextInt();
		y = t.nextInt();
		x0 = t.nextInt();
		y0 = t.nextInt();
	} 

	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	int getX0(){
		return x0;
	}
	int getY0(){
		return y0;
	}
}