public class Task_17 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int s = 0;
		int[] massive = new int[20];
		int i;
		
		for (i = 0; a > 0; i++) {
			massive[i] = a % b;
			a = a / b;
		}

		for (i-= 1; i > -1; i--) {
			System.out.print(massive[i]);
			s += massive[i] ;
		}
		
		System.out.println();
		
		
		for (i = 0; s > 0; i++) {
			massive[i] = s % b;
			s = s / b;
		}
		
		for (i-= 1; i > -1; i--) {
			System.out.print(massive[i]);
		}
	}
}