package technoserve.c2tc.java;

import java.util.*;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		//Print the Sum of the two strings
	    int sum;
	    sum = a.length() + b.length();
	    System.out.println("The sum of the two strings is "+sum);
	    System.out.println();
	    
	    //Determine if A is lexicographically larger than B
	    int get_data = a.compareTo(b);
	    if(get_data<0)
	    {
	        System.out.println("A is lexicographically greater than b");
	    }
	    else if(get_data==0)
	    {
	        System.out.println("The strings are equal");
	    }
	    else
	    {
	        System.out.println("b is greater than a");
	    }
	    System.out.println();
	    
	    //Capitalize the first letter and print on same line
	    String firstletter1 = a.substring(0,1);
	    String remainingletter1 = a.substring(1,a.length());
	    
	    firstletter1 = firstletter1.toUpperCase();
	    
	    a = firstletter1 + remainingletter1;
	    
	    String firstletter2 = b.substring(0,1);
	    String remainingletter2 = b.substring(1,b.length());
	    
	    firstletter2 = firstletter2.toUpperCase();
	    
	    b = firstletter2 + remainingletter2;
	    System.out.println(a+" "+b);
	    sc.close();
	}

}
