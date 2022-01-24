package technoserve.c2tc.java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuffer sb =  new StringBuffer(A);
		for(int i=0; i<A.length();i++)
		{
			char ch = A.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch = (char)((int)ch+32);
				sb.setCharAt(i, ch);
			}
			else
			{
				ch = (char)((int)ch-32);
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb);
	}

}
