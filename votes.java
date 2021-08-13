import java.util.Scanner;

public class votes {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total number of votes : ");
	    int n=sc.nextInt();
	    int other= (n*80*45)/(100*100);
	    System.out.print("The number of valid votes for other candidate are : "+other);
	}
}
