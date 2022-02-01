package technoserve.c2tc.java;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		boolean flag = false;
		//If length of the strings are unequal, they are not anagrams
		if(a.length()!=b.length())
		{
		    System.out.println("Not Anagrams");
		}
		
		//Convert the strings to Arrays
		char array_a[] = a.toCharArray();
		char array_b[] = b.toCharArray();
		
		Arrays.sort(array_a);
		Arrays.sort(array_b);
		
		for(int i=0;i<a.length();i++)
		{
		    if(array_a[i]!=array_b[i])
		    {
		        System.out.println("Not Anagrams");
		        flag = true;
		        break;
		    }
		}
		if(flag==false)
		{
		    System.out.println("Anagrams");
		}
		sc.close();
	}

}
