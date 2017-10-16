import java.util.*;
public class ASSIGNMENT2 {
	
	
	public static  void main (String[] args) {
		
		int memberID;
		int numberItems;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your CSU ID");
		memberID=input.nextInt();
		System.out.println("Please enter how many items you wish to buy");
		numberItems=input.nextInt();
		
		
		
	}
	
	
	public void checkConditions(int memberID1 , int numberItems2 ) {
		
		if (memberID1>=40000 && memberID1<90000) {
			
						if (numberItems2>=1 && numberItems2<=10) {
				
				
								}else {
									
									
									System.out.println("You can not Purchase "+numberItems2);
				
				
				
								}
			
			
			
		}else {
			
			
			System.out.println("Invalid CSU ID");
			
		}
		
		
		
	}
	
	public void checkMembers() {
		
		
		
	}
	
	
	
	

}
