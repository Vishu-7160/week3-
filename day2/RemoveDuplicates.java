package week3.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String Text = new String("We learn java basics as part of java sessions in java week1");
		String duplicate = "";
		int count = 0;
		String[] strArray = Text.split(" ");
		Arrays.sort(strArray);
		for (int i = 0; i < strArray.length-1; i++) {
			if(strArray[i].equals(strArray[i+1]))
			{
				count++;
				duplicate = strArray[i];
			}
			
			if (count > 1) {
				System.out.println("Original String is - " + Text);
				Text = Text.replace(duplicate, " ");
				System.out.println("Replaced String is - " + Text);
				break;

	}

		}
	}
}
