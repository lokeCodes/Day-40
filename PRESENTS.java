// https://www.codechef.com/problems/PRESENTS
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
		    int x = s.nextInt();
		    int res = x-(x/5);
		    System.out.println(res);
		  //  int count=0;
		  //  for(int i=1;i<=x;i++){
		  //     if(i%5==0){
		  //         continue;
		  //     }else{
		  //         count++;
		  //     }
		  //  }
		  //  System.out.println(count);
		}
	}
}
