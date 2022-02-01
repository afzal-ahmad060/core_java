package technoserve.c2tc.java;

import java.util.*;


public class Arrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println();
		int array[] = new int[size];
		for(int i=0;i<size;i++)
		{
		    array[i] = sc.nextInt();  
		}
		System.out.println();
		int key = sc.nextInt();
		boolean bool = false;
		for(int i=0;i<size;i++)
		{
		    if(array[i]==key)
		    {
		        System.out.println("Index Position of "+key+" is "+i);
		        bool = true;
		        break;
		    }
		}
		if(bool==false)
		    System.out.println("Key not found");
		sc.close();
	}
}
