import java.util.*;
public class Short_Hand {
	
public static void main(String[] arg) {
	
	
	System.out.println("Please enter a String that is less than 20 letters ");
	
	Scanner input=new Scanner(System.in);
	
	String word=input.next();  
	
	int length=word.length();
	
	
	if(length<20) {
		
		string_char_array(word,length);
		
	}
	
	else {
		
		System.out.println("The word is to long");
		
		
		
		
	} 
	
}

public static void string_char_array(String word2, int length2) {
	
	char a[]=new char[20];
	int k=0;
	
	for(int i=0;i<length2;i++) {
		
		a[k]=word2.charAt(k);
		System.out.println(a[k]);
		k++;
	}
	
	
}


}
