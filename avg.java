import java.io.*;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        int i,s=0,n;
        float av;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        for(i=0;i<10;i++){
            n=sc.nextInt();
            s=s+n;
        }
        av=s/(float)10;
        System.out.println("The average "+"is "+av);
    }
}
