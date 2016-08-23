import java.io.*;
import java.util.*;
	
public class ArraysDS {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in); 
	        Stack input = new Stack(); 
	        int value = in.nextInt(); 
	        int count = 0; 
	        while(count < value)
	          {
	                input.push(in.nextInt()); 
	           count++; 
	          
	        }
	                       while(!input.empty())
	          {
	            System.out.print(input.pop() + " "); 
	        }
	        
	    }
	
}
