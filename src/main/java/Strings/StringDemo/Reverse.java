package Strings.StringDemo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
        System.out.println( "Enter String value" );
        String a=sc.next();
        int i;
        String b="";
        for(i=a.length()-1;i>=0;i--)
        {
        	b=b+a.charAt(i);
        }
	System.out.println(b);
	}

}
