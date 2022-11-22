package week3.day2;

public class Palindrome {

	public static void main(String[] args)
	{

		String str1 = "civic";
		String rev = "";

		char[] ch = str1.toCharArray();

		for (int i = ch.length; i > 0 ; i--) {
			rev = rev.concat(String.valueOf(ch[i-1]));		
		}

		System.out.println("The given word is " + str1);
		System.out.println("The reversed word is " + rev);

		if (str1.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	}


