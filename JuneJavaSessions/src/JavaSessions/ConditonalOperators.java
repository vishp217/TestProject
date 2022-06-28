package JavaSessions;

public class ConditonalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a==b){
		    System.out.println("a is eqaul to b");
		}
		else{
			System.out.println("both are not equal");
			
		}
		int c = 10;
		int d = 10;
			
			if(c==d){
			    System.out.println("c is eqaul to d");
			}
			else{
				System.out.println("both are not equal");
			}
			
			int totalamount = 200;
			int expectedAmount = 200;
			
			if(totalamount==expectedAmount){
				System.out.println("PASS");
			}
			else{
				System.out.println("FAIL");
			}	
				
			//<> <= >= == !=
			int e = 100;
			int f = 200;
			if(f>e){
				System.out.println("f is grether then e");
			}
			else{	
				System.out.println("e is grether then d");
			}
			
			int j = 200;
			int k = 200;
			if(k>=j){
				System.out.println("k is grether then or equal to j");
			}
			else {
				System.out.println("j is grether then or equal to k");
			}
			
			//WAP to find the highest number out of three numbers;
			
			int x = 100;
			int y = 200;
			int z = 300;
			
			if(x>y && x>z){//false && false
				System.out.println("x is the highest number");
			}
			else if(y>z){//false 
				System.out.println("y is the highest number");
			}
			else{
		         System.out.println("z is the highest number");
			}
			
			
			
			
			
			
		    }
		
		
	}
		
		
		
		



