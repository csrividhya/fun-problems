import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class string_removal{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String ip=s.nextLine();
    int i,count=0;

 
 for(i=0;i<ip.length()-1;i++)
        if(ip.charAt(i)==ip.charAt(i+1))
		count++;


    for(i=1;i<ip.length();i++)
        if(ip.charAt(i-1)==ip.charAt(i))
        {
		if(i==0)
			ip=ip.substring(i+2);
		else if(i==ip.length()-2)
			ip=ip.substring(0,ip.length()-3);
		else	ip=ip.substring(0,i-1)+ip.substring(i+1);

i=0;

        }

    
    if(ip.length()==0)
        System.out.println("Empty String");
    else
        System.out.println(ip);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
