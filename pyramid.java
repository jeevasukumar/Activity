import java.util.Scanner;
public class pyramid {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int v=1,s=n-1,num1=1;
		while(v<=n){
			for(int i=1;i<=s;i++)
				System.out.print(" ");
			for(int i=1;i<=v;i++){
				if(num1>9){
					num1=num1%9-1;
				}
				System.out.print(num1);num1++;
			}
			int r=num1-2;
			for(int i=1;i<v;i++){
				if(r<0){
					r=9;
				}
				System.out.print(r);
				r--;
			}
			v++;System.out.print("\n");s--;
		}
	}
}

