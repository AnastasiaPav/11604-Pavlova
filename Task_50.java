import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class Task_50 {
	public static void main(String[] args) {
		Random s = new Random();
		Integer[] a = new Integer[s.nextInt(10)+1];
		
		
		for (int i = 0; i < a.length; i++ ) {
			a[i] = s.nextInt(100);
		}
		System.out.println("oooo");
		
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length / 2; i++ ) {
			int b = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = b;
		}
		
		System.out.println(Arrays.toString(a));
		
		Collections.reverse(Arrays.asList(a));
		
		
		
		
	
	}
}