// https://www.codechef.com/problems/FLOW013
// Quesiton Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int total = a+b+c;
		    String res = (total==180) ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
