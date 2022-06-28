package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++;//post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int p = 1;
		int q = ++p; //pre increment
		System.out.println(p);//2
		System.out.println(q);//2
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int h = 2;
		int g = --h; //pre decrement
		System.out.println(h);//1
		System.out.println(g);//1
		
		int a = 5;
		int b = a++;//post increment
	    System.out.println(a);//6
	    System.out.println(b);//5
	    
	    int c = 5;
	    int d = ++c;//pre increment
	    System.out.println(c);//6
	    System.out.println(d);//6
	    
	    int e = 5;
	    int f = e--;//post deincrement
	    System.out.println(e);//4
	    System.out.println(f);//5
	    
	    int x = 5;
	    int y = --x;//post deincrement
	    System.out.println(x);//4
	    System.out.println(y);//4
		
		
		
		
		
		
	}

}
