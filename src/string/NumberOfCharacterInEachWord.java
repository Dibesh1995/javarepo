package string;

import java.util.Scanner;

public class NumberOfCharacterInEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		String[]words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String eachword = words[i];
			int count = eachword.length();
			
			System.out.println("Number of characters in "+eachword+" are: "+count);
			
		}
	}

}
