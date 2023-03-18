// https://www.codechef.com/problems/CHEFRACES
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
            int a = s.nextInt();
            int b = s.nextInt(); 
            int c = s.nextInt();
            int d = s.nextInt();
            int count = 0;
            if(a!=c && b!=c){
                count++;
            }
            
            if(a!=d && b!=d){
                count++;
            }
            
            System.out.println(count);
		}
	}
}
