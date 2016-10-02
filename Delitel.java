public class Delitel {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		String deliteli = "";
			if (n > 0){
		for(int i = 1; i <= n; i++){
			if ((n % i) == 0){
		deliteli += i;
		deliteli += " ";
		}
	}
}
else
{
	for(int i = -1; i >= n; i--){
		if ((n % i) == 0){
			deliteli += i;
			deliteli += " ";
	}
}
		int z = Math.abs(n);
			if (z > 0){
				for(int i = 1; i <= z; i++){
					if ((z % i) == 0){
		deliteli += i;
		deliteli += " ";
			}			
		}
	}
}
		System.out.print(deliteli);
	}
}