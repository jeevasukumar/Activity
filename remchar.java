import java.util.*;    
import java.util.Scanner;
public class remchar {
	  static void removeDuplicate(char s[], int len)   
	    {   
	        int index = 0;   
	        for (int i = 0; i < len; i++)   
	        {      
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (s[i] == s[j])   
	                {   
	                    break;   
	                }   
	            }  
	            if (j == i)    
	            {   
	                s[index++] = s[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(s, index)));   
	    }   
	    public static void main(String[] args)   
	    {   Scanner sc= new Scanner(System.in);
	    	String info= sc.nextLine();
	        char s[] = info.toCharArray();  
	        int len1 = s.length;   
	        removeDuplicate(s, len1);   
	    }   
	}

