package string;

import java.util.Scanner;

public class DisplayoccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		char ch='a';
		int count=0;
		
		for(int i=0;i<26;i++)
		{
			
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					count++;
				}
			}
			
			if(count>0)
			{
				System.out.println(ch+":"+count);
			}
			ch++;
			count=0;
		}
		

	}

}
