import java.util.*;
public class Short_Hand {
//main method, decides if the string is less than 20 words, if it is, it calls method to convert from string to character into an array	
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
//string_char_array is called by the main takes, in a string and integer that describes the length of the string.
//uses the arguments to take characters in the string and put them an a character array  using for loop which goes by the length of the string
//it then calls a new method "char_list" which takes in the character array ,length of the string "k",and the string it self "word2" 
public static void string_char_array(String word2, int length2) {
	
	char a[]=new char[20];
	int k=0;
	
	for(int i=0;i<length2;i++) {
		
		a[k]=word2.charAt(k);
		k++;
	}
	
	char_list(a, k,word2);
	
}

//char_list converts the array to arrayList so we can remove vowels we don't want, but also create another list we can put vowels in
//it also displays the shorthand word an index
public static void char_list(char[] b, int g, String word3) {
	
	 List<Character> Letters=new ArrayList<Character>();//list for the character arrays
	 
	 //for loop that converts char arrays to list "Letters"
	 for(int i=0;i<=g;i++ ) {
		 
		 
		 Letters.add(b[i]);
		 
	 }
	 System.out.print("The short hand word is:  ");
	 
	 //list for the vowels
	 List<Character> VowelCollection=new ArrayList<Character>();
	 
	 //for loop that runs trough the list collection 
	 for(int j=0;j<Letters.size();j++) {
		 
		 //while loop that looks for vowels in the vowel list collection
		 while (Letters.get(j)=='a'||Letters.get(j)=='e'||Letters.get(j)=='i'||Letters.get(j)=='o'||Letters.get(j)=='u') {
			//if it finds a vowel it puts it in the vowel collection 
			 VowelCollection.add(Letters.get(j));
			 
			 //and removes it from the letter collection
			 Letters.remove(j);
			 
		 }
	
		 
			 System.out.print(Letters.get(j));//prints what is left in the letter collection
			 
		 
		 
		 
	 }
	 System.out.print("\n");//make new line
	 //check if string contains a vowel to decide if it should use vowel collection to determine the index of the first vowel
	 if (word3.contains("a")||word3.contains("e")||word3.contains("i")||word3.contains("o")||word3.contains("u")) {
	 System.out.println("The index of the first vowel is :"+word3.indexOf(VowelCollection.get(0)));// prints the index of the first vowel if applicable
	
	 }
	 else {
		 System.out.println("The original word had no vowels");//if not applicable prints word has no vowels 
	 }
	 
	 /*i realize that this program is to long and perhaps there is a much simpler way of achieving the same thing, but by the time realize it 
	  * it was too late and i was in to deep*/
}




}
