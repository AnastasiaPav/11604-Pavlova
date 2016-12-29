import java.util.Scanner;
public class Task_53 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String s1 = "";

	for (int i = 0; i < s.length(); i++) {
		if ((s.charAt(i) == '(')||(s.charAt(i) == ')')||(s.charAt(i) == '[')||(s.charAt(i) == ']')||(s.charAt(i) == '{')||(s.charAt(i) == '}')) {
		s1 += s.charAt(i);
		}
	}


	s = checkIfStrIsRight(s1);
		
		if (s.length() == 0) {
			System.out.println("Is right");
		} 
		else {
			System.out.println("Isn't right");
		}
		
	}
	
	public static String checkIfStrIsRight(String str) {
		String s1 = str;
		str = str.replace("()", "");
		str = str.replace("{}", "");
		str = str.replace("[]", "");
		
		if (!str.equals(s1)) {
			return checkIfStrIsRight(str);
		} 
			return str;
		
	}
}

