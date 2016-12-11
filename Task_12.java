public class Task_12 {
		public static void main(String[] args){
			
			int n = Integer.parseInt(args[0]);
			
			int[][] m  = new int[100][100];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m[i][j] = (i+1)*(j+1);
					System.out.print(m[i][j] + "\t");
				}
   				System.out.println();
			}
		}
	}