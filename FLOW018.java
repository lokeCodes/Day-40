// https://www.codechef.com/problems/FLOW018
// Question Link^^^

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
		    int n = s.nextInt();
		    int fact = 1;
		    for(int i=n;i>1;i--){
		        fact = fact * i;
		    }
		    System.out.println(fact);
		}
	}
}
