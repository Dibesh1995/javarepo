package string;

import java.util.Scanner;

public class Anagram {
	public static String removeSpace(String s)
	{
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				ns=ns+ch;
			}
		}
		return ns;
	}
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
		
	   int a[]=new int[26];
	   int b[]=new int[26];
	   for(int i=0;i<s1.length();i++)
	   {
		   char ch=s1.charAt(i);
		   
		    a[ch-'a']++;
		    char ch1=s2.charAt(i);
		    b[ch1-'a']++;
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]!=b[i])
		   {
			   return false;
		   }
	   }
		}
		
	   return true;
	}

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1=sc.nextLine().toLowerCase();
        System.out.println("Enter 2nd string");
        String s2=sc.nextLine().toLowerCase();
        s1=removeSpace(s1);
        s2=removeSpace(s2);
        boolean res=isAnagram(s1, s2);
        if(res==true)
        {
        	System.out.println("two strings are anagram");
        }
        else
        {
        	System.out.println("two strings are not anagram");
        }
        
        
	}

}
