public class Task_30 {
    public static void main(String[] args) {
		
        if(args.length != 0)
        	System.out.println(palindrome(args[0])); 
        else System.out.println("Enter something!");
		
    }
 
    public static boolean palindrome(String data) {
        
		int dataLen = data.length();
			for(int i = 0; i < dataLen / 2; i++)
				if(data.charAt(i) != data.charAt(dataLen - i - 1))
                return false;
				return true;
		}
	}