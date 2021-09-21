package basic;

public class LearnStatic {
	
	
	public static String stname="iddir";
	public String StAddress="NJ";
	
	public static void xyz(){
		
		System.out.println("iphone");
		
	}
	
	
	
	public void practice() {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		// LearnStatic.stname;
		System.out.println(LearnStatic.stname);
		
		// to call a non static variable/method, we have to create an object and call by the object name
		
		// class name object name= new constructor of class(); 
		
		LearnStatic obj= new LearnStatic();
		
		// obj.StAddress;
		
		System.out.println(obj.StAddress);
		
		LearnStatic.xyz();obj.practice();
		
		
		
		
		
		
		
		
	}
	
	

}
