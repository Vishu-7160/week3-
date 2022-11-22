package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		String Text = "changeme";
		char[] ch1 = Text.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if (!(i%2 == 0)) {
				ch1[i] = Character.toUpperCase(ch1[i]);
			}
		}
		System.out.print(ch1);
	}

	}


