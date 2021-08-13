import java.util.Scanner;

public class calculatearea {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int d = 23;
	    int peri = 206;
	    int sum = peri/2;
	    int l=(d+sum)/2;
	    int b=sum-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
}
