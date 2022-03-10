package c2tc.java.Singleton;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Singleton obj = Singleton.getSingleInstance();
		obj.str=sc.nextLine();
		System.out.println("Hello I am Singleton! Let me say "+obj.str+" to you.");
	}
}
