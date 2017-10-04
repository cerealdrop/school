package substring;
import java.util.*;
public class SUBSTRINGS {
	
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		Scanner gett=new Scanner(System.in);
		System.out.println(" please enter two string");
		
		String s1=input.next();
		String s2=gett.next();
		char check1;
		char check2;
		
		char[] z=new char [20];
	
		
		
		int s1length=s1.length();
		
		int s2length=s2.length();
		
		if(s1length>=s2length) {
			
			
			for(int i=0;i<=s1length;i++) {
				
				
				
				
				
				check1=s1.charAt(i);
				check2=s2.charAt(i);
				if(check1==check2) {
					
					z[i]=check1;
					
				}
				
				
			}
			
		}
		
		else {
			
			
			for(int k=0;k<=s2length;k++) {
				
				check1=s1.charAt(k);
				check2=s2.charAt(k);
				if(check1==check2) {
					
					z[k]=check1;
					
				}
				
				
			}
			
		}
		
		String substring=new String(z);
		
		System.out.println(substring);
		
	}
	
	

}
