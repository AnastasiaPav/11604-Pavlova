public class Task_16 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int[] y = new int[20];
		int i, j = 0;
		
		for (i = 0; x > 0; i++) {
			y[i] = x % 2;
			if (y[i] % 2 == 1) {
				j++;
			}
			x = x / 2;
		}

		for (i-= 1; i > -1; i--) {
			System.out.print(y[i]);
		}
		
		System.out.println();
		System.out.println(j);
	}
}