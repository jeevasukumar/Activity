import java.io.*;
import java.lang.Math;
import java.util.Scanner;

	    
public class greatest 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int a=43,b=91,c=183;
    
      int x=Math.abs(a-b);
      int y=Math.abs(c-b);
      int z=Math.abs(c-a);
      int gcdNumbers = greatest.findGCD(x, y, z);
      System.out.println(gcdNumbers);
      sc.close();
   }
   public static int findGCD(int v, int w) 
   {
      if(w == 0)
      {
         return v;
      }
      else
      {
         return findGCD(w, v % w);
      }
   }
   public static int findGCD(int x, int y, int z) 
   {
      return findGCD(findGCD(x, y), z);
   }
}

