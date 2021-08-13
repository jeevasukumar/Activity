import java.util.Scanner;

public class repeat {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,m=0,repeat=0;
		int arr[]=new int[n];
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>m){
				m=arr[i];
				repeat=0;
			}
			if(arr[i]==m)
				repeat++;
		}
		System.out.print(repeat);
	}
}
