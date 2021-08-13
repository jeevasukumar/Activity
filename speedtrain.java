import java.util.Scanner;

public class speedtrain {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int len,s,time;
		System.out.print("Enter the train length : ");
		len = sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		s = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time = sc.nextInt();
		int rts = ((len*18)/(time*5));
		int speed = rts + s;
		System.out.print("The speed of train in km/hr is : "+speed);
	}
}